import React, { useState } from 'react';
import Formpage from './components/Formpage';
import Display from './components/Display';

function App() {
  const [colors, setColors] = useState(["red", "black", "pink"]);
  const addcolors = (newcolor) => {
    setColors([...colors, newcolor])
    console.log(colors);
  }
  return (
    <div className="squarebox">
      <Formpage addcolor={addcolors} />
      <div className='OX'>
        {colors.map((color) => {
          return <Display bg={color} />
        })}
      </div>
    </div>
  );
}

export default App;
