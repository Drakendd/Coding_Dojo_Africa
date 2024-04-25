import React, { useEffect, useState } from 'react'
import axios from "axios"
import { Link } from 'react-router-dom'

const List = () => {
    const [authors,setAuthors]=useState([])
    useEffect(()=>{
        axios.get("http://localhost:8000/api/authors")
            .then(response=>{console.log("SUCCES");setAuthors(response.data)})
            .catch(error=>console.log("ERROR ",error))
    },[]);
    const deleteAuthor = (id) =>{
        axios.delete(`http://localhost:8000/api/authors/${id}`)
            .then(res=>{setAuthors(authors.filter((p)=>p._id!==id));console.log("DELETED 👍",res)})
            .catch(error=>console.log(error))
    }
  return (
    <div>
        <h1 className='display-1'>Authors </h1>
        <Link to={"/books/new"}><button className='btn btn-dark mb-5 '>Add A New Author</button></Link>
        <table className='table table-bordered'>
            <thead className='table-dark'>
                <tr>
                    <th>
                        Author
                    </th>
                    <th colSpan="2">
                        Options
                    </th>
                </tr>
            </thead>
            <tbody className='table-group-divider'>
                {authors? authors.map(one_author=>
                <tr key={one_author._id}>
                    <td>{one_author.name}</td>
                    <td><Link to={`/books/edit/${one_author._id}`}><button className='btn btn-warning'>Edit</button></Link></td>
                    <td><button className='btn btn-danger' onClick={()=>deleteAuthor(one_author._id)}>Delete</button></td>

                </tr>):<tr><td>LOADING 🔁</td></tr>}
            </tbody>
        </table>
    </div>
)
}

export default List
