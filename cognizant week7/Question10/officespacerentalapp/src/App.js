import React, { useState } from "react";
import "./App.css";

function App() {
  const [showList, setShowList] = useState(true);

  const heading = <h1 className="title">🏢 Office Space Rental App</h1>;

  const imageUrl = "https://images.unsplash.com/photo-1573164574572-cb89e39749b4";

  const office = {
    name: "Skyline Tower",
    rent: 75000,
    address: "123 Business Bay, Mumbai",
  };

  const officeList = [
    {
      name: "Ocean View",
      rent: 55000,
      address: "Marine Drive, Mumbai",
    },
    {
      name: "Cyber Park",
      rent: 62000,
      address: "Sector 62, Noida",
    },
    {
      name: "Tech Hub",
      rent: 45000,
      address: "Indiranagar, Bangalore",
    },
  ];

  const toggleList = () => setShowList(!showList);

  return (
    <div className="App">
      {heading}

      <img src={imageUrl} alt="Office Space" className="office-img" />

      <div className="featured-card">
        <h2>🌟 Featured Office</h2>
        <p><strong>Name:</strong> {office.name}</p>
        <p>
          <strong>Rent:</strong>{" "}
          <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
            ₹{office.rent}
          </span>
        </p>
        <p><strong>Address:</strong> {office.address}</p>
      </div>

      <button className="toggle-btn" onClick={toggleList}>
        {showList ? "Hide" : "Show"} Other Offices
      </button>

      {showList && (
        <div>
          <h2>🏘 Available Offices</h2>
          <div className="office-grid">
            {officeList.map((item, index) => (
              <div key={index} className="office-card">
                <p><strong>Name:</strong> {item.name}</p>
                <p>
                  <strong>Rent:</strong>{" "}
                  <span style={{ color: item.rent < 60000 ? "red" : "green" }}>
                    ₹{item.rent}
                  </span>
                </p>
                <p><strong>Address:</strong> {item.address}</p>
              </div>
            ))}
          </div>
        </div>
      )}
    </div>
  );
}

export default App;
