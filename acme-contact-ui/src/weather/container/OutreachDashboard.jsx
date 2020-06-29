import React from 'react';
import axios from 'axios';
import OutreachTable from '../component/OutreachTable'

class WeatherDashboard extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            schedule: [],
            numDaysInForecast: props.numDays || 5,
            recommendations: [
                {
                    day: "Monday",
                    method: "Email"
                },
                {
                    day: "Tuesday",
                    method: "SMS"
                },
                {
                    day: "Wednesday",
                    method: "SMS"
                },
                {
                    day: "Thursday",
                    method: "Phone"
                },
                {
                    day: "Friday",
                    method: "Email"
                }

            ]
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
        const numDays = this.state.recommendations.length;
        return (
            <div>
                <h1>Here's your {numDays}-day Outreach Recommendations for Minneapolis, MN</h1>
                <OutreachTable recommendations={this.state.schedule} />
            </div>
        );
    }
}

export default WeatherDashboard;