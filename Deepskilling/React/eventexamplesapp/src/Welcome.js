import React from "react";

function sayWelcome(name) {
  alert(`Welcome, ${name}!`);
}

function Welcome() {
  return <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>;
}

export default Welcome;
