import React from "react";

const IndianPlayers = () => {
  const T20players = ["Virat", "Rohit", "Surya", "Hardik"];
  const RanjiPlayers = ["Shaw", "Iyer", "Gill", "Rahane"];
  const allPlayers = [...T20players, ...RanjiPlayers];

  const oddTeam = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 === 0);
  return (
    <div>
      <h2>Indian Players</h2>

      <h3>Odd Team:</h3>
      <ul>
        {oddTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h3>Even Team:</h3>
      <ul>
        {evenTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h3>All Players (Merged):</h3>
      <ul>
        {allPlayers.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>
    </div>
  );
};
export default IndianPlayers;
