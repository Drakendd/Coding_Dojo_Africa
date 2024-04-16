import React from 'react'
import { useParams } from "react-router";
function Word() {
    const {word} = useParams();
  return (
    <div>
{ isNaN(word)?<h1> The Word is : {word}</h1> : <h1>The Number is : {word}</h1> }
    </div>
  )
}
export default Word