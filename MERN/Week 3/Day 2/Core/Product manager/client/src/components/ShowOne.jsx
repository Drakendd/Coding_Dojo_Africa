import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams, Link } from 'react-router-dom';

const ShowOne = () => {
  const {id}=useParams();
  const[product,setProduct]=useState({title:"",price:"",description:""});
  useEffect(()=>{
    axios.get(`http://localhost:5000/api/products/${id}`)
    .then(response=>{console.log("product ✔");setProduct(response.data)})
    .catch(error=>console.log("❌",error))
  },[])
  return (
    <div>
      <h1>Title: {product.title}</h1>
      <h3>Description: {product.description}</h3>
      <h3>Price: {product.price} DT</h3>
      <Link to="/"><button className='btn btn-primary mt-5 '>Return ↩</button></Link>
    </div>
  )
}

export default ShowOne
