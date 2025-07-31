import React, { Component } from 'react';
import './Getuser.css';

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null,
      loading: true,
      error: null,
    };
  }

  componentDidMount() {
    fetch('https://api.randomuser.me/')
      .then((response) => response.json())
      .then((data) => {
        this.setState({
          user: data.results[0],
          loading: false,
        });
      })
      .catch((error) => {
        this.setState({ error: 'Failed to fetch user data.', loading: false });
      });
  }

  render() {
    const { user, loading, error } = this.state;

    if (loading) {
      return <div className="user-card loading">Loading user data...</div>;
    }

    if (error) {
      return <div className="user-card error">{error}</div>;
    }

    return (
      <div className="user-container">
        <div className="user-card">
          <img src={user.picture.large} alt="User" className="user-img" />
          <h2>{user.name.title} {user.name.first}</h2>
          <p className="email">{user.email}</p>
          <button onClick={() => window.location.reload()} className="btn">Get Another User</button>
        </div>
      </div>
    );
  }
}

export default Getuser;
