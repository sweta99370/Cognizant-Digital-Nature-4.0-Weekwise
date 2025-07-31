import React, { useState } from "react";
import ListofPlayers from "./ListofPlayers";
import IndianPlayers from "./IndianPlayers";
import './App.css';

function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div className="App">
      <h1>🏏 Cricket App</h1>
      <button onClick={() => setFlag(!flag)}>
        {flag ? "Show Indian Players" : "Show Player List"}
      </button>

      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
