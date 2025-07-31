import React, { useState } from "react";
import EmployeesList from "./components/EmployeesList";
import ThemeContext from "./context/ThemeContext";
import "./index.css";

function App() {
  const [theme, setTheme] = useState("light");

  const toggleTheme = () =>
    setTheme((prev) => (prev === "light" ? "dark" : "light"));

  return (
    <ThemeContext.Provider value={theme}>
      <div className={`app-container ${theme}`}>
        <header>
          <h1>👩‍💼 Employee Management</h1>
          <button onClick={toggleTheme} className="toggle-btn">
            Switch to {theme === "light" ? "Dark" : "Light"} Theme
          </button>
        </header>
        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
