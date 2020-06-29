import React from 'react';
import axios from 'axios';
import OutreachTable from '../component/OutreachTable'

class WeatherDashboard extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            schedule: []
        }
    }

    componentDidMount() {
        axios.get("http://localhost:8080/acme-contact/v1/recommendations")
            .then(response => {
                const schedule = response.data
                this.setState({schedule})
            })
            .catch(error => {
                console.log(error)
            })
    }

    render() {
        return (
            <div>
                <h1>Outreach Recommendations for Minneapolis, MN</h1>
                <OutreachTable recommendations={this.state.schedule} />
            </div>
        );
    }
}

export default WeatherDashboard;