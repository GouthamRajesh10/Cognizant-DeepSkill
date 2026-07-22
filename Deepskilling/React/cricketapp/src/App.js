import React from "react";
import ListofPlayers from "./ListofPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {
  const flag = true; // change to false to see the other component

  return <div>{flag ? <ListofPlayers /> : <IndianPlayers />}</div>;
}

export default App;
