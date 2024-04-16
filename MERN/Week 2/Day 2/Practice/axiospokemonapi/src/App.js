import React, { useState } from 'react';
import axios from 'axios';

function App() {

  const [pokemon , setPokemon] = useState([]);
  const fetchpokemon = () => {

  axios.get('https://pokeapi.co/api/v2/pokemon?limit=807&offset=0s').then(response=>
  {
    console.log(response.data.results);
    setPokemon(response.data.results);
    console.log(pokemon);
  })

  }
  return (
    <div className="App">
      <header className="head_app">
      <button onClick={fetchpokemon}>fetch Pokemon </button>
      <div>
      {pokemon.map((p,i)=>{
        return(
          <ul key={i}>
        <li >{p.name}</li>
      </ul>
        )
      }
    )
      }
      </div>
      </header>
    </div>
  );
}

export default App;
