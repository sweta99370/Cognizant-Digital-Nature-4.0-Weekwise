import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
      message: '',
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 }, this.sayHello);
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    console.log("Hello! Static Message.");
    this.setState({ message: 'Hello! Button clicked to increase.' });
  };

  sayWelcome = (msg) => {
    this.setState({ message: msg });
  };

  handleSyntheticEvent = (e) => {
    e.preventDefault(); // this is a synthetic event
    this.setState({ message: 'I was clicked (Synthetic Event)' });
  };

  render() {
    return (
      <div className="App">
        <h1>🎯 React Event Examples</h1>

        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to React Event Handling!")}>
          Say Welcome
        </button>

        <br /><br />
        <button onClick={this.handleSyntheticEvent}>Synthetic OnPress</button>

        <p className="message">{this.state.message}</p>

        <hr />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
