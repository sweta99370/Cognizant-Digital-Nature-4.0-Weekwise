import React from 'react';

function AuthButtons({ isLoggedIn, onLogin, onLogout, onSignup }) {
  return (
    <div>
      {isLoggedIn ? (
        <button onClick={onLogout}>Logout</button>
      ) : (
        <>
          <button onClick={onLogin}>Login</button>
          <button onClick={onSignup}>Sign Up</button>
        </>
      )}
    </div>
  );
}

export default AuthButtons;