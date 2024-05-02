import React, { useState } from 'react';

const App = () => {

  const initialState = [
    {id: 1, title: "Java"},
    {id: 2, title: "C"}
  ];

  const [skills,setSkills] = useState(initialState);

  const ShowData = () => {
    return(
      <ul>
        {
          skills.map((skill) => {
            const li =
            <li key={skill.id}>{skill.title}</li>
            return li;
          })
        }

      </ul>

    );
  };


  // Also works. ( instead of {

  const ShowData2 = () => {
    return(
      <ul>
        {
          skills.map((skill) => (

            <li key={skill.id}>{skill.title}</li>
          ))
        }

      </ul>

    );
  };

  return (
    <div className='container'>
      <ShowData skills={skills} />
      <ShowData />
      <ShowData2 />
      
    </div>
  );
};

export default App;
