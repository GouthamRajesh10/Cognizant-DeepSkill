import "./App.css";
import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Abse Wahab"
        School="CUSAT"
        Total={480}
        Goal={6}
      />
    </div>
  );
}

export default App;