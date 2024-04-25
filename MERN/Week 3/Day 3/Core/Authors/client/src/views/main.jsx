//---------------------------------------------------------------------------------------------------------------------------------------
// import react -----------------------------------------
import React from 'react';
import'../App.css'
// import library------------------------------------------------------------------------------------------------------------------------
import {useEffect,useState} from 'react';   


import axios from 'axios';            
import Liste from '../components/liste';
//============================================================================================================================================


const Main = (props) => {

  const [autors, setAutors]= useState([]);
  const [isLoding, setIsLoding]= useState(true);
 
  useEffect( ()=>{
    
    axios.get(`http://localhost:8000/api/authors`)
    .then(response =>{
        console.log(response.data); 
        setAutors(response.data)
        setIsLoding(false)
      }) 
                
    .catch(err =>{console.log("thi is error came from axios in allNote ", err);})               // if err catch err
},[]);


  return (
    <div className='App'> <h1>Authors</h1>
    {isLoding ? "loding" : <Liste autors={autors} />}
</div>
  )
}

export default Main