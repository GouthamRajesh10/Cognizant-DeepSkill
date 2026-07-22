import React from "react";

const officeList = [
  { name: "Downtown Suite", rent: 55000, address: "MG Road" },
  { name: "Tech Park Office", rent: 72000, address: "Whitefield" },
  { name: "Startup Hub", rent: 45000, address: "Koramangala" },
];

function OfficeItem({ office }) {
  const rentStyle = {
    color: office.rent < 60000 ? "red" : "green",
  };

  return (
    <div style={{ border: "1px solid #ccc", margin: "10px", padding: "10px" }}>
      <p>Name: {office.name}</p>
      <p style={rentStyle}>Rent: {office.rent}</p>
      <p>Address: {office.address}</p>
    </div>
  );
}

function App() {
  return (
    <div>
      {/* Heading element */}
      <h1>Office Space Rental</h1>

      {/* Attribute to display an image */}
      <img
        src="https://via.placeholder.com/300x150"
        alt="office space"
        width="300"
      />

      {/* Loop through list of office objects */}
      {officeList.map((office, i) => (
        <OfficeItem key={i} office={office} />
      ))}
    </div>
  );
}

export default App;
