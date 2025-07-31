import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    const referenceNumber = 'REF' + Math.floor(Math.random() * 1000000);
    alert(`Complaint submitted!\nReference Number: ${referenceNumber}`);
    
    // Reset the form
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>Complaint Register</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Employee Name: </label>
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Complaint: </label>
          <br />
          <textarea
            rows="5"
            cols="40"
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            required
          />
        </div>
        <br />
        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
