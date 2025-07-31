// File: src/App.js
import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';
import AuthButtons from './components/AuthButtons';
import SignupForm from './components/SignupPage';


function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [showSignup, setShowSignup] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
    setShowSignup(false);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  const handleSignupClick = () => {
    setShowSignup(true);
  };

  const handleSignupSuccess = () => {
    setShowSignup(false);
    setIsLoggedIn(true);
  };

  return (
    <div>
      <h1>Ticket Booking App</h1>
      <AuthButtons 
        isLoggedIn={isLoggedIn} 
        onLogin={handleLogin} 
        onLogout={handleLogout} 
        onSignup={handleSignupClick} 
      />
      {showSignup ? (
        <SignupForm onSignupSuccess={handleSignupSuccess} />
      ) : (
        isLoggedIn ? <UserPage /> : <GuestPage />
      )}
    </div>
  );
}

export default App;