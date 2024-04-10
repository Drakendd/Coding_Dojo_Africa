import React, { Component } from 'react'

export default class PersonCard extends Component {
    // constructor(props){
    //     super(props)


    //    const personeA =  this.props.persone1
    // }
    render() {
    return (
        <div> 
            {/* {JSON.stringify(this.props)} */}
            <div>
                <legend>Person.jsx</legend>
                <center>
                    <h3> first Name  and last Name : {this.props.persone1.firstname}  {this.props.persone1.lastname}</h3>
                    <p> age :{this.props.persone1.age}</p>
                    <p> Hair Color : {this.props.persone1.hairColor} </p>
                </center>
            </div>
            <div>
                <legend>Person.jsx</legend>
                <center>
                    <h3> first Name  and last Name : {this.props.persone2.firstname}  {this.props.persone2.lastname}</h3>
                    <p> age :{this.props.persone2.age}</p>
                    <p> Hair Color : {this.props.persone2.hairColor} </p>
                </center>
            </div>
            <div>
                <legend>Person.jsx</legend>
                <center>
                    <h3> first Name  and last Name : {this.props.persone3.firstname}  {this.props.persone3.lastname}</h3>
                    <p> age :{this.props.persone3.age}</p>
                    <p> Hair Color : {this.props.persone3.hairColor} </p>
                </center>
            </div>
            <div>
                <legend>Person.jsx</legend>
                <center>
                    <h3> first Name  and last Name : {this.props.persone4.firstname}  {this.props.persone4.lastname}</h3>
                    <p> age :{this.props.persone4.age}</p>
                    <p> Hair Color : {this.props.persone4.hairColor} </p>
                </center>
            </div>

            


            
        </div>
    )
    }
}

