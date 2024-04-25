//1. import mongoose 
const mongoose =require("mongoose");
//2. create a schema
const NuthorSchma = new mongoose.Schema({
                                    name :{ type :String ,
                                    minlength :[3 ,"{PATH} must be  more than 3 caractere"],
                                    required : [true, 'Name is required']
                                    },
},
{timestamps: true }
);
//create instant of schema
const author = mongoose.model("author" ,NuthorSchma );
// export schema
module.exports = author ;
