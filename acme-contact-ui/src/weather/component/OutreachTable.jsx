import React from 'react';
import OutreachDay from './OutreachDay';

class ForecastTable extends React.PureComponent {

    constructor(props) {
        super(props);
    }

    render() {
        return(
            <div class="container">
                <div class="row">
                    {this.props.recommendations.map((recommendation) =>
                        <div class="col">
                            <OutreachDay recommendation={recommendation} />
                        </div>
                    )}
                </div>
            </div>
        );
    }
}

export default ForecastTable;