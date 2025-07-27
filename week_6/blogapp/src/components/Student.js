import React, { Component } from 'react';

// Define a class component that extends React.Component
class Student extends Component {
  render() {
    // Access the props passed from the App component using 'this.props'
    const { name, sub1, sub2, sub3 } = this.props;

    // Calculate the total marks
    const total = sub1 + sub2 + sub3;

    // Return the JSX to be displayed
    return (
      <div style={{ border: '1px solid #ccc', margin: '10px', padding: '10px', borderRadius: '5px' }}>
        <h2>Student Details</h2>
        <p><strong>Name:</strong> {name}</p>
        <p><strong>Marks in Subject 1:</strong> {sub1}</p>
        <p><strong>Marks in Subject 2:</strong> {sub2}</p>
        <p><strong>Marks in Subject 3:</strong> {sub3}</p>
        <hr />
        <p><strong>Total Marks:</strong> {total}</p>
      </div>
    );
  }
}

export default Student;