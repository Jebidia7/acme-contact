import React from 'react';

class OutreachDay extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {

        return(
            <div className="outreach-day">
                <p>{this.props.recommendation.day}</p>
                <p>{this.props.recommendation.method}</p>
            </div>


        );
    }
}

export default OutreachDay;