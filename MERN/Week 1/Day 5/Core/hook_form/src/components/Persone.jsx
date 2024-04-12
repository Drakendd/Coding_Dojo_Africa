
import React, { useState } from 'react';
import './style.css'
function Persone(props) {
    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [lastname, setLastname] = useState("");
    const [Password, setPassword] = useState("");
    const [confpass, setConfpass] = useState("");

    const submite = (e) => { e.preventDefault(); }



    return (

        <div>
            <form onSubmit={submite} >
                <fieldset>

                    <div className="flex">
                        <div className='ajustement'>
                            <label > first name </label>
                            <label >Last name </label>
                            <label >E-mail </label>
                            <label > Password </label>
                            <label > confirm Password </label>
                        </div>
                        <div className='ajustement'>
                            <input type="text" onChange={(e) => setUsername(e.target.value)} />
                            <input type="text" onChange={(e) => setLastname(e.target.value)} />
                            <input type="text" onChange={(e) => setEmail(e.target.value)} />
                            <input type="text" onChange={(e) => setPassword(e.target.value)} />
                            <input type="text" onChange={(e) => setConfpass(e.target.value)} />
                        </div>
                    </div>
                    <div className='main'>
                        <input type="button" value=" submit" className='bt' />
                    </div>
                </fieldset>
            </form>
            <div className="flex_2">
                <div className='ajustement_text'>
                    <p> your  first and last name : </p>
                    <p>your mail :</p>
                    <p> your pass word :  </p>
                    <p>your confirm Password</p>
                </div>
                <div className='ajustement_text'>
                    <p>{username} {lastname}</p>
                    <p>{email}</p>
                    <p>{Password}</p>
                    <p> {confpass}</p>
                </div>
            </div>

        </div>

    )
}

export default Persone
