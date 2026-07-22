import React from "react";

const players = [
  { name: "Player1", score: 85 },
  { name: "Player2", score: 45 },
  { name: "Player3", score: 92 },
  { name: "Player4", score: 30 },
  { name: "Player5", score: 71 },
  { name: "Player6", score: 65 },
  { name: "Player7", score: 20 },
  { name: "Player8", score: 99 },
  { name: "Player9", score: 55 },
  { name: "Player10", score: 60 },
  { name: "Player11", score: 78 },
];

function ListofPlayers() {
  // map() — display all players
  const allPlayers = players.map((p, i) => (
    <li key={i}>
      {p.name}: {p.score}
    </li>
  ));

  // arrow function + filter — players scoring below 70
  const lowScorers = players.filter((p) => p.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>{allPlayers}</ul>

      <h3>Players with score below 70</h3>
      <ul>
        {lowScorers.map((p, i) => (
          <li key={i}>
            {p.name}: {p.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
