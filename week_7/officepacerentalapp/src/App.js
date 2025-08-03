import React from 'react';
import officeIMage from './components/offIMG.jpg';
function App() {
  const heading = <h1 style={{ textAlign: 'center', color: '#333' }}>Office Space Rental App</h1>;


  const officeList = [
    {
      name: "Tech Park One",
      rent: 75000,
      address: "Koramangala, Bangalore"
    },
    {
      name: "Startup Hub",
      rent: 55000,
      address: "Hitech City, Hyderabad"
    },
    {
      name: "BizZone",
      rent: 62000,
      address: "Andheri East, Mumbai"
    }
  ];

  const getRentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      {heading}

      <img src={officeIMage} alt="office" style={{
    maxWidth: '100%',
    height: 'auto',
    display: 'block',
    margin: '0 auto',
    borderRadius: '8px'
  }}/>
      <h2 style={{ textAlign: 'center' }}>Available Spaces</h2>
      
      <div>
        {officeList.map((office, index) => (
          <div key={index} style={{
            border: '1px solid #ccc',
            margin: '10px 0',
            padding: '10px',
            borderRadius: '8px'
          }}>
            <p><strong>Name:</strong> {office.name}</p>
            <p><strong>Address:</strong> {office.address}</p>
            <p><strong>Rent:</strong> <span style={getRentStyle(office.rent)}>{office.rent}</span></p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
