
import React from 'react';

const PersonCard = ({ person, onBirthday }) => {
    const { firstname, lastname, age, hairColor } = person;

    const handleBirthdayClick = () => {
        onBirthday(firstname);
    };

    return (
        <div className="person-card">
            <h2>{firstname} {lastname}</h2>
            <p>Age: {age}</p>
            <p>Hair Color: {hairColor}</p>
            <button onClick={handleBirthdayClick}>Birthday button</button>
        </div>
    );
};

export default PersonCard;
