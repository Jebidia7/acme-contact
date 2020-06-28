import React from 'react';
import OutreachTable from '../component/OutreachTable'

class WeatherDashboard extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
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

    render() {
        const numDays = this.state.recommendations.length;
        return (
            <div>
                <h1>Here's your {numDays}-day Outreach Recommendations for Minneapolis, MN</h1>
                <OutreachTable recommendations={this.state.recommendations} />
            </div>
        );
    }
}

export default WeatherDashboard;