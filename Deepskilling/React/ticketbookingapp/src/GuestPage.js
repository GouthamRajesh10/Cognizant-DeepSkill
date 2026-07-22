import React from "react";

function GuestPage() {
  const flights = [
    { flightNo: "AI101", from: "Delhi", to: "Mumbai", fare: 4500 },
    { flightNo: "AI202", from: "Bangalore", to: "Chennai", fare: 2500 },
  ];

  return (
    <div>
      <h2>Available Flights (Guest View)</h2>
      <ul>
        {flights.map((f, i) => (
          <li key={i}>
            {f.flightNo}: {f.from} → {f.to} (₹{f.fare})
          </li>
        ))}
      </ul>
      <p>Login to book a ticket.</p>
    </div>
  );
}

export default GuestPage;
