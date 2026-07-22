import React from "react";

function PressButton() {
  const handlePress = (e) => {
    // e here is React's SyntheticEvent
    console.log("SyntheticEvent type:", e.type);
    alert("I was clicked");
  };

  return <button onClick={handlePress}>OnPress</button>;
}

export default PressButton;
