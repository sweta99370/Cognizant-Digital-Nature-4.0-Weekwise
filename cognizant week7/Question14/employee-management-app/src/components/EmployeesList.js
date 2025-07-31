import React from "react";
import EmployeeCard from "./EmployeeCard";

const employees = [
  { id: 1, name: "Alice Smith", designation: "Frontend Developer" },
  { id: 2, name: "Bob Johnson", designation: "Backend Developer" },
  { id: 3, name: "Charlie Rose", designation: "UI/UX Designer" },
];

const EmployeesList = () => {
  return (
    <div className="employee-list">
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
};

export default EmployeesList;
