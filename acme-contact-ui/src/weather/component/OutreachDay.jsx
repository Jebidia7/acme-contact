import React from 'react';
import OutreachTimeslot from './OutreachTimeslot';

class OutreachDay extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {

        const dayOfWeek = this.props.recommendation.day_of_week;
        const methodTimeslots = this.props.recommendation.outreach_method_times

        return(
            <div className="outreach-day">
                <p>{dayOfWeek}</p>
                <ul className="outreach-day-list">
                    {methodTimeslots.map((methodTime) =>
                        <OutreachTimeslot methodTime={methodTime} />
                    )}
                </ul>
            </div>


        );
    }
}

export default OutreachDay;