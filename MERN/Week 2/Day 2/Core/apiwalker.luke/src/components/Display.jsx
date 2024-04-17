import React, { useState } from 'react'
import { useParams } from "react-router";
import 'bootstrap/dist/css/bootstrap.min.css';
function Display(props) {
  const responseData = props.responseData
  const { data } = useParams();

  return (
    <div>
      <p>{data}</p>

      {data === "people" ? <div>
        <h1> {responseData.name}</h1>
        <p> Height :  {responseData.height} </p>
        <p> Mass : {responseData.mass} </p>
        <p> Hair color : {responseData.hair_color} </p>
        <p> Skin color : {responseData.skin_color}</p>
      </div> : 
      <div>
        <h1> {responseData.name}</h1>
        <p> Rotation period :  {responseData.rotation_period} </p>
        <p> Orbital period : {responseData.orbital_period} </p>
        <p> Diameter : {responseData.diameter} </p>
        <p> Climate: {responseData.climate}</p>
      </div>
      }
    </div>
  )
}
export default Display