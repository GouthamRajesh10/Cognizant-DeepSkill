import React from "react";

const books = [
  { id: 1, title: "Clean Code" },
  { id: 2, title: "Effective Java" },
  { id: 3, title: "You Don’t Know JS" },
];

function BookDetails() {
  return (
    <div>
      <h2>Book Details</h2>
      <ul>
        {books.map((book) => (
          <li key={book.id}>{book.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
