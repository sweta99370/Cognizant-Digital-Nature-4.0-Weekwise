// src/CohortDetails.js
import React from 'react';

const CohortDetails = ({ cohort }) => {
  return (
    <div data-testid="cohort-details">
      <h3>{cohort.code}</h3>
      <p>{cohort.name}</p>
      <p>Status: {cohort.status}</p>
    </div>
  );
};

export default CohortDetails;
