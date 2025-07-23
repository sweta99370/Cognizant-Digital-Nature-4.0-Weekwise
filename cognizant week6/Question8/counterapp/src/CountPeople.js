import React, { Component } from "react";

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState({ entryCount: this.state.entryCount + 1 });
  };

  updateExit = () => {
    this.setState({ exitCount: this.state.exitCount + 1 });
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h1>🏬 People Counter</h1>
        <p><strong>Entered:</strong> {this.state.entryCount}</p>
        <p><strong>Exited:</strong> {this.state.exitCount}</p>

        <button onClick={this.updateEntry} style={{ marginRight: "10px" }}>
          Login
        </button>
        <button onClick={this.updateExit}>
          Exit
        </button>
      </div>
    );
  }
}

export default CountPeople;
