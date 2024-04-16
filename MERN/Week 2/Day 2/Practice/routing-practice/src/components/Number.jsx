import React from 'react'
import { useParams } from "react-router";
function Number(props) {
    const {txt} = useParams();
    const {bg} = useParams();
    const {colortext} = useParams();
    
    const divStyle = {
        color:colortext,
        backgroundColor: bg,
        };
  return (
    <div>
        
        <h1 style={divStyle}>The Word is : {txt} </h1>
    </div>
  )
}
export default Number