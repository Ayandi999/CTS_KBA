import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import './App.css'; // import CSS

function App() {
  const [active, setActive] = useState("book");

  const renderComponent = () => {
    if (active === "book") return <BookDetails />;
    if (active === "blog") return <BlogDetails />;
    if (active === "course") return <CourseDetails />;
    return <p>Please select an option above.</p>;
  };

  return (
    <div className="app-container">
      <h1 className="app-title">📚 Blogger App</h1>

      <div className="nav-buttons">
        <button className={active === "book" ? 'active' : ''} onClick={() => setActive("book")}>Book</button>
        <button className={active === "blog" ? 'active' : ''} onClick={() => setActive("blog")}>Blog</button>
        <button className={active === "course" ? 'active' : ''} onClick={() => setActive("course")}>Course</button>
      </div>

      <div className="component-box">
        {renderComponent()}
      </div>
    </div>
  );
}

export default App;
