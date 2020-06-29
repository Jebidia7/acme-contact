import React from 'react';
import OutreachDay from './OutreachDay';

class ForecastTable extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {
        return(
            <div className="container">
                <div className="row">
                    {this.props.recommendations.map((recommendation) =>
                        <div className="col">
                            <OutreachDay key={recommendation.day_of_week} recommendation={recommendation} />
                        </div>
                    )}
                </div>
            </div>
        );
    }
}

export default ForecastTable;