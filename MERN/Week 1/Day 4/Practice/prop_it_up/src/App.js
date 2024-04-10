import PersonCard from './Components/PersonCard';
import './App.css';

function App() {

  const persone1 ={
    firstname : "Doe" ,
    lastname : "Jane",
    age : 45 ,
    hairColor : "black",
}

const persone2 ={
  firstname : "Smith" ,
  lastname : "John",
  age : 88 ,
  hairColor : "Brown",
}

const persone3 ={
firstname : "Fillmore" ,
lastname : "Millard",
age : 50 ,
hairColor : "Brown",
}

const persone4 ={
firstname : "Smith" ,
lastname : "Maria",
age : 62 ,
hairColor : "Brown",
}

  return (
    <div classname="App">
      <PersonCard persone1={persone1}  persone2={persone2} persone3={persone3} persone4={persone4}/>
    </div>
  );
}

export default App;
