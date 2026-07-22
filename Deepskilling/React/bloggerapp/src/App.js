import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("book");

  // 1. if/else style (as a helper function)
  function renderView() {
    if (view === "book") {
      return <BookDetails />;
    } else if (view === "blog") {
      return <BlogDetails />;
    } else if (view === "course") {
      return <CourseDetails />;
    }
    return null;
  }

  return (
    <div>
      <h1>Blogger App</h1>

      <button onClick={() => setView("book")}>Show Books</button>
      <button onClick={() => setView("blog")}>Show Blogs</button>
      <button onClick={() => setView("course")}>Show Courses</button>

      {/* if/else via function */}
      {renderView()}

      <hr />

      {/* 2. Ternary operator style */}
      <h3>Ternary example</h3>
      {view === "book" ? <p>You're viewing Books</p> : <p>Not viewing Books</p>}

      {/* 3. Logical && operator style (prevents rendering when false) */}
      <h3>&& operator example</h3>
      {view === "blog" && <p>You're viewing Blogs</p>}

      {/* 4. Element variable style */}
      <h3>Element variable example</h3>
      {(() => {
        let message;
        if (view === "course") {
          message = <p>You're viewing Courses</p>;
        } else {
          message = <p>Pick a category above</p>;
        }
        return message;
      })()}
    </div>
  );
}

export default App;
