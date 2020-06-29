import React from 'react';
import moment from 'moment';

class OutreachTimeslot extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {
        const startTime = moment(this.props.methodTime.start_time * 1000).format("LT")
        const methods = this.props.methodTime.methods.join(", ")
        return(
            <li>
                <p>{startTime}</p>
                <p>{methods}</p>
            </li>
        );
    }
}

export default OutreachTimeslot;