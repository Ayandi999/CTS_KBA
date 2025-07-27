import React from 'react';
import Student from './components/Student'; // Import the Student component
import './App.css'; // Optional: for styling

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Student Results</h1>
      </header>
      <main>
        {/* Use the Student component and pass the required props.
          You can reuse the component for multiple students.
        */}
        <Student name="Ayandip" sub1={95} sub2={88} sub3={92} />
        <Student name="Riya" sub1={85} sub2={91} sub3={89} />
      </main>
    </div>
  );
}

export default App;