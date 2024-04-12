import React, { useState } from 'react';
import PersonCard from './Components/PersonCard';
import './App.css';

function App() {
  const peopleData = [
    {
      firstname: 'Jane',
      lastname: 'Doe',
      age: 45,
      hairColor: 'black',
    },
    {
      firstname: 'John',
      lastname: 'Smith',
      age: 88,
      hairColor: 'Brown',
    },
    {
      firstname: 'Fillmore',
      lastname: 'Millard',
      age: 50,
      hairColor: 'Brown',
    },
    {
      firstname: 'Smith',
      lastname: 'Maria',
      age: 62,
      hairColor: 'Brown',
    },
  ];

  const [people, setPeople] = useState(peopleData);

  const handleBirthday = (firstname) => {
    const updatedPeople = people.map((person) => {
      if (person.firstname === firstname) {
        return { ...person, age: person.age + 1 };
      }
      return person;
    });
    setPeople(updatedPeople);
  };

  return (
    <div className="App">
      <h1>People Cards</h1>
      {people.map((person, index) => (
        <PersonCard
          key={index}
          person={person}
          onBirthday={handleBirthday}
        />
      ))}
    </div>
  );
}

export default App;
