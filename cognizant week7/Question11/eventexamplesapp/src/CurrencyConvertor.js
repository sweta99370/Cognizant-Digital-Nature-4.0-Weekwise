import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euros: '',
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault(); // synthetic event
    const euroRate = 0.011; // 1 INR = 0.011 EUR approx
    const euros = (this.state.rupees * euroRate).toFixed(2);
    this.setState({ euros });
  };

  render() {
    return (
      <div className="converter">
        <h2>💱 Currency Converter</h2>
        <form onSubmit={this.handleSubmit}>
          <label>
            Enter Amount in ₹:
            <input
              type="number"
              value={this.state.rupees}
              onChange={this.handleChange}
              placeholder="e.g. 1000"
            />
          </label>
          <button type="submit">Convert to €</button>
        </form>

        {this.state.euros && (
          <p>Converted Amount: <strong>€{this.state.euros}</strong></p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
