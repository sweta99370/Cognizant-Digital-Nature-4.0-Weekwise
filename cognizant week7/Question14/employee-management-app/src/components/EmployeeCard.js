import React, { useContext } from "react";
import ThemeContext from "../context/ThemeContext";

const EmployeeCard = ({ employee }) => {
  const theme = useContext(ThemeContext);

  return (
    <div className={`card ${theme}`}>
      <h3>{employee.name}</h3>
      <p>{employee.designation}</p>
      <button className={`action-btn ${theme}`}>View Profile</button>
    </div>
  );
};

export default EmployeeCard;
