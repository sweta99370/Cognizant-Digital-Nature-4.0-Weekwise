// src/components/BookItem.js
import React from 'react';

const BookItem = ({ book }) => {
  return (
    <li>
      <strong>{book.title}</strong> by {book.author}
    </li>
  );
};

export default BookItem;
