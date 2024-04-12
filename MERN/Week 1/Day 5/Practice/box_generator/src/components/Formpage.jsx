import React, { useState } from 'react'
import './style.css'

function Formpage(props) {
  const [input, setInput] = useState('');
  const submitHandler = (e) => {
    e.preventDefault();
    console.log("done submiting");
    props.addcolor(input);
  }
  return (
    <div >
      <form onSubmit={submitHandler} className='FORM'>
        <label htmlFor="">  chose Color  :</label> <p><input type="text" onChange={(e) => { setInput(e.target.value) }} /></p>
        <p><button> Add a Color </button></p>
      </form>
    </div>
  )
}

export default Formpage