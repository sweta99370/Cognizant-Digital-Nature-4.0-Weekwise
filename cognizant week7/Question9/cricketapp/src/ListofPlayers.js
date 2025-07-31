import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 85 },
    { name: "Dhoni", score: 45 },
    { name: "Kohli", score: 75 },
    { name: "Hardik", score: 65 },
    { name: "Jadeja", score: 82 },
    { name: "Ashwin", score: 35 },
    { name: "Gill", score: 91 },
    { name: "Pant", score: 60 },
    { name: "Shami", score: 55 },
    { name: "Bumrah", score: 88 },
  ];

  const filteredPlayers = players.filter(player => player.score >= 70);

  return (
    <div>
      <h2>List of Players (Score ≥ 70)</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
