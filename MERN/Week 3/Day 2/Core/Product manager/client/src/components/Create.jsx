import React, { useState } from 'react'
import { useNavigate, Link } from 'react-router-dom';
import axios from 'axios';

const Create = () => {
  const[newProduct,setNewProduct]=useState({});
  const[errors,setErrors]=useState({})
  const nav=useNavigate();
  const addHandler = (e)=>{
    e.preventDefault();
    axios.post("http://localhost:5000/api/products/new",newProduct)
      .then(res=>nav("/"))
      .catch(error=>setErrors(error.response.data.errors))
  }
  return (
    <div>
      <h1 className='display-1'>Add a new product</h1>
      <form onSubmit={addHandler}>
        <label>Title:</label>
          {errors.title? <p className='text-danger' style={{textTransform: 'capitalize'}}>{errors.title.message}</p>:<></>}
          <input type="text" className='form-control' name='title' onChange={(e)=>{setNewProduct({...newProduct, title:e.target.value})}}/>
        <label>Price:</label>
        {errors.price? <p className='text-danger' style={{textTransform: 'capitalize'}}>{errors.price.message}</p>:<></>}
          <input type="number" className='form-control' name='price' onChange={(e)=>{setNewProduct({...newProduct, price:e.target.value})}}/>
        <label>Description:</label>
          {errors.description? <p className='text-danger' style={{textTransform: 'capitalize'}}>{errors.description.message}</p>:<></>}
          <input type="text" className='form-control' name='description' onChange={(e)=>{setNewProduct({...newProduct, description:e.target.value})}}/>
          <button className='btn btn-info'>ADD</button>
      </form>
      <Link to="/"><button className='btn btn-primary mt-5 '>Return ↩</button></Link>
    </div>
  )
}

export default Create
