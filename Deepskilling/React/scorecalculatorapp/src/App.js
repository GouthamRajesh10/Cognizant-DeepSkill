import "./App.css";
import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Goutham Rajesh"
        School="CUSAT"
        Total={320}
        Goal={5}
      />
    </div>
  );
}

export default App;
