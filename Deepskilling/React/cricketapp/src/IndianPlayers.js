import React from "react";

const team = {
  odd: ["PlayerA", "PlayerC", "PlayerE"],
  even: ["PlayerB", "PlayerD", "PlayerF"],
};

// Destructuring
const { odd: oddTeam, even: evenTeam } = team;

const T20players = ["T1", "T2", "T3"];
const RanjiTrophyPlayers = ["R1", "R2", "R3"];

// Merge using spread (ES6 "merge" feature)
const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

function IndianPlayers() {
  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji Trophy)</h2>
      <ul>
        {mergedPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
