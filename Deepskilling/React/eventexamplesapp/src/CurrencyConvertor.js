import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = { rupees: "", euros: null };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(e) {
    this.setState({ rupees: e.target.value });
  }

  handleSubmit(e) {
    e.preventDefault();
    const rate = 0.011; // approx INR -> EUR
    const euros = (this.state.rupees * rate).toFixed(2);
    this.setState({ euros });
  }

  render() {
    return (
      <div>
        <h2>Currency Convertor (INR → EUR)</h2>
        <form onSubmit={this.handleSubmit}>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
            placeholder="Enter amount in Rupees"
          />
          <button type="submit">Convert</button>
        </form>
        {this.state.euros !== null && (
          <p>
            {this.state.rupees} INR = {this.state.euros} EUR
          </p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
