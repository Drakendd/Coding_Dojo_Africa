import React, { useEffect, useState } from 'react'
import axios from "axios"
import 'bootstrap/dist/css/bootstrap.min.css'
import { Link } from 'react-router-dom'

const Home = () => {
    const [products,setProducts]=useState([])
    useEffect(()=>{
        axios.get("http://localhost:5000/api/products")
            .then(response=>{console.log("SUCCES");setProducts(response.data)})
            .catch(error=>console.log("ERROR ❌",error))
    },[]);
    const deleteProduct = (id) =>{
        axios.delete(`http://localhost:5000/api/products/${id}`)
            .then(res=>{setProducts(products.filter((p)=>p._id!==id));console.log("DELETED 👍",res)})
            .catch(error=>console.log(error))
    }
  return (
    <div>
        <h1 className='display-1'>Product Manager</h1>
        <Link to={"/create"}><button className='btn btn-dark mb-5 '>Add A New Product</button></Link>
        <table className='table table-bordered'>
            <thead className='table-dark'>
                <tr>
                    <th>
                        Title
                    </th>
                    <th>
                        Price
                    </th>
                    <th>
                        Description
                    </th>
                    <th colSpan="2">
                        Options
                    </th>
                </tr>
            </thead>
            <tbody className='table-group-divider'>
                {products? products.map(one_product=>
                <tr key={one_product._id}>
                    <td><Link to={`/product/${one_product._id}`}>{one_product.title}</Link></td>
                    <td>{one_product.price} DT</td>
                    <td>{one_product.description}</td>
                    <td><Link to={`/product/update/${one_product._id}`}><button className='btn btn-warning'>Edit</button></Link></td>
                    <td><button className='btn btn-danger' onClick={()=>deleteProduct(one_product._id)}>Delete</button></td>

                </tr>):<h5>LOADING 🔁</h5>}
            </tbody>
        </table>
    </div>
)
}

export default Home
