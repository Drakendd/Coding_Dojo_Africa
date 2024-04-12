import React ,{useState} from 'react'
import './style.css'
function Form() {
    const [firstname, setFirstname] = useState("")
    const [lastname, setLastname ] = useState("")
    const [email, setEmail] = useState("")
    const [Password,setPassword ] = useState("")
    const [confirm, setConfirm] = useState("")
    const submite = (e) =>{e.preventDefault(); 
        const newUser = { firstname,lastname,email,Password};
        console.log("Welcome", newUser);};
    const Messagefirst = () => {
        if( firstname.length < 3 ) {
        return "Your first name must be atleast 7  caracters";} }
    const Messagelast = () =>{
        if (lastname.length < 3) {
            return "Your Last name must be atleast 3 caracters";} }
    const Messagemail = () =>{
        if (email.length < 3) {
            return "Your email adress must be atleast 10 caracters ";} }
    const Messagepass = () =>{
        if (Password.length < 8) {
            return "Your password must be atleast 8 caracters ";} }
    const Messageconf = () =>{
        if (Password !== confirm) {
            return "your confirmed password must match your password ";} }
    return (
        <div>
        <form onSubmit={submite} >
                <h1>More FORMS</h1>
                <fieldset>
                <div className="la">
                    <div className='k2'>
                        <label >First name </label>
                        <label >Last name </label> 
                        <label >E-mail </label>
                        <label>Password </label>
                        <label >Confirm Password </label>
                    </div>
                    <div className='k2'>
                        <input type="text" onChange={(e)=>setFirstname(e.target.value)}/>
                        <input type="text" onChange={(e)=>setEmail(e.target.value)} />
                        <input type="text"  onChange={(e)=>setLastname(e.target.value)} />
                        <input type="text" onChange={(e)=>setPassword(e.target.value)} />
                        <input type="text"  onChange={(e)=>setConfirm(e.target.value)}/>
                    </div>
                </div>
                <div className='main'>
                <input type="button" value=" submit"  className='bt'/>
                </div>
                </fieldset>
                <h5>{Messagefirst()}</h5>
                <h5>{Messagelast()}</h5>
                <h5>{Messagemail()}</h5>
                <h5>{Messagepass()}</h5>
                <h5>{Messageconf()}</h5>
            </form>
    <div className="la">
        <div className='K1'>
        <p>Your  first and last name : </p>
        <p>Your email address :</p>
        <p>Your Password :  </p>
        <p>Your confirmed Password</p>
        </div>
        <div className='K1'> 
            <p>{firstname} {lastname}</p>
            <p>{email}</p>
            <p>{Password}</p>
            <p>{confirm}</p>
        </div>
    </div>
</div>
)
}
export default Form