
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import  Forme  from './components/Forme';
import './App.css';
import Display from './components/Display';
import {
  Routes,
  Route,
  Link
} from "react-router-dom";

function App() {
  const arr=['people','planets'];
  const [data , setdata]=useState('');
  const [id , setId]=useState('');
  const [responseData, setResponseData] = useState([]);

  const sendData =(data , id , responseData )=>{
    setdata(data);
    setId(id);
    setResponseData(responseData);
    console.log(responseData)
    console.log(id);
    
  }


  return (
    <div className="App">
    
        <Forme  arr={arr} sendData={sendData} />

        <Routes>
        <Route path="/:data/:id" element={ <Display responseData={responseData} />} />
        </Routes>
        {responseData.name}
            
    
    </div>
  );
}
export default App;
