import React from "react";

const courses = [
  { id: 1, title: "Java Fundamentals" },
  { id: 2, title: "Spring Boot Essentials" },
  { id: 3, title: "React for Beginners" },
];

function CourseDetails() {
  return (
    <div>
      <h2>Course Details</h2>
      <ul>
        {courses.map((course) => (
          <li key={course.id}>{course.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default CourseDetails;
