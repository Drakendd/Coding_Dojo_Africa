import React from 'react'
import { useState } from 'react';
import axios from 'axios';
import { useNavigate } from "react-router-dom";


const Add = (props) => {
    const [name, setName] = useState('');
    const [errors, setErrors] = useState({});

    const Navigate = useNavigate();


    const newauther = (e) => {
        e.preventDefault();

        axios.post(`http://localhost:8000/api/authors`, { name })
            .then(() => {
                Navigate("/");
            })
            .catch((err) => {
                const errResponse = err.response.data.errors;
                const errObjt = {};
                for (const key of Object.keys(errResponse)) {
                    errObjt[key] = errResponse[key].message;
                }
                setErrors(errObjt);

                console.log(errResponse)
                console.log(errors)
            })
    }




    return (
        <div>
            <form onSubmit={newauther}>

                <label htmlFor=""> Author name  </label>
                <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
                <button>Submit</button>


            </form>




        </div>
    )
}

export default Add