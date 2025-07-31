import React from "react";

const CreateElementExample = () => {
  return React.createElement(
    "h2",
    { style: { color: "blue" } },
    "This heading is created using React.createElement"
  );
};

export default CreateElementExample;
