import React from 'react';

class OutreachTimeslot extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {
        return(
            <li>
                <p>{this.props.methodTime.start_time}</p>
            </li>
        );
    }
}

export default OutreachTimeslot;