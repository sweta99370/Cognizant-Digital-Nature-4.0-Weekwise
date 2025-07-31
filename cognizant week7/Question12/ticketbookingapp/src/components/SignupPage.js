import React, { useState } from 'react';

function SignupForm() {
  const [formData, setFormData] = useState({ username: '', email: '', password: '' });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Signed up as: ${formData.username}`);
  };

  return (
    <form onSubmit={handleSubmit} style={{ padding: '20px' }}>
      <h3>Sign Up</h3>
      <input name="username" placeholder="Username" onChange={handleChange} required /><br />
      <input name="email" type="email" placeholder="Email" onChange={handleChange} required /><br />
      <input name="password" type="password" placeholder="Password" onChange={handleChange} required /><br />
      <button type="submit">Register</button>
    </form>
  );
}

export default SignupForm;
