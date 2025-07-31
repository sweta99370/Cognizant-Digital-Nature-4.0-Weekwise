// src/components/BookDetails.js
import React, { useState } from 'react';
import BookItem from './BookItem';

const books = [
  { id: 1, title: 'React Explained', author: 'Zac Gordon' },
  { id: 2, title: 'Learning React', author: 'Alex Banks' },
  { id: 3, title: 'The Road to React', author: 'Robin Wieruch' }
];

const BookDetails = () => {
  const [showBooks, setShowBooks] = useState(true);

  const toggleBooks = () => {
    setShowBooks(!showBooks);
  };

  return (
    <div>
      <h2>📚 Book Details</h2>
      <button onClick={toggleBooks}>
        {showBooks ? 'Hide Books' : 'Show Books'}
      </button>
      {showBooks && (
        <ul>
          {books.map((book) => (
            <BookItem key={book.id} book={book} />
          ))}
        </ul>
      )}
    </div>
  );
};

export default BookDetails;
