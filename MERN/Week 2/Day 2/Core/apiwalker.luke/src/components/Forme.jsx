import React, { useEffect, useState } from 'react'
import { useNavigate } from "react-router-dom";
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';

function Forme(props) {
    const arr = props.arr;
    const [inputid, setInputid] = useState('');
    const [iselected, setIselected] = useState(arr[0]);
    const navigate = useNavigate();
    const [responseData, setResponseData] = useState([]);
    const Handler = (e) => {
        e.preventDefault();
        axios.get(`https://swapi.py4e.com/api/${iselected}/${inputid}/`)
            .then(response => { setResponseData(response.data); })
            .catch(err => { console.log("thi is error came from axios ", err); })
        props.sendData(iselected, inputid, responseData);
        navigate(`/${iselected}/${inputid}`);
    }
    return (
        <div>
            Serch for :
            <form onSubmit={Handler}>
                <select value={iselected} onChange={e => setIselected(e.target.value)}>
                    {arr.map((el, idx) => {
                        return <option key={idx} value={el} > {el}</option>
                    })}
                </select>
                <label htmlFor=""> ID :</label>
                <input type="text" on onChange={(e) => { setInputid(e.target.value) }} />
                <button> search</button>
            </form>
        </div>
    )
}
export default Forme

















