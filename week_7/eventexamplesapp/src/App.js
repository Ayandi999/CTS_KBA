import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  };

  sayHello = () => {
    alert('Hello! You just incremented the value.');
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayWelcome = (message) => {
    alert(`Welcome Message: ${message}`);
  };

  handleClick = (e) => {
    alert('I was clicked');
    console.log('Synthetic event:', e);
  };

  render() {
    return (
      <div style={{ padding: '20px' }}>        
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <hr />

        <button onClick={() => this.sayWelcome("Welcome to React Events!")}>
          Say Welcome
        </button>

        <hr />

        <button onClick={this.handleClick}>
          Click on me
        </button>

        <hr />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
