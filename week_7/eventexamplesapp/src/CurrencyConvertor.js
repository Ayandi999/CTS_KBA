import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: 'dollar',
      converted: '',
      rates: {
        dollar: 0.012, // 1 INR ≈ 0.012 USD
        euro: 0.011,   // 1 INR ≈ 0.011 EUR
        pound: 0.0095  // 1 INR ≈ 0.0095 GBP
      }
    };
  }

  handleAmountChange = (e) => {
    this.setState({ amount: e.target.value });
  };

  handleCurrencyChange = (e) => {
    this.setState({ currency: e.target.value });
  };

  handleConvert = () => {
    const { amount, currency, rates } = this.state;
    const value = parseFloat(amount);
    if (!isNaN(value)) {
      const converted = value * rates[currency];
      this.setState({ converted: converted.toFixed(2) });
    } else {
      this.setState({ converted: '' });
    }
  };

  render() {
    const { amount, currency, converted } = this.state;

    return (
      <div>
        <h2>Currency Convertor</h2>
        <div style={{ marginBottom: '10px' }}>
          <input
            type="number"
            placeholder="Enter amount in INR"
            value={amount}
            onChange={this.handleAmountChange}
            style={{ marginRight: '10px' }}
          />
          <select value={currency} onChange={this.handleCurrencyChange}>
            <option value="dollar">Dollar</option>
            <option value="euro">Euro</option>
            <option value="pound">Pound</option>
          </select>
        </div>
        <button onClick={this.handleConvert}>Convert</button>

        {converted && (
          <p>
            Converted Amount in {currency.charAt(0).toUpperCase() + currency.slice(1)}: <strong>{converted}</strong>
          </p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
