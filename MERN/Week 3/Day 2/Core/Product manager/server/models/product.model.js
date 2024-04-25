const mongoose = require('mongoose');

const ProductSchema= new mongoose.Schema({
title:{
        type: String,
        required:[true, "{PATH} is required."],
        minlength:[3,"{PATH} must be at least 3 characters."]
        },
price:{
        type:Number,
        required:[true,"{PATH} is required."],
        min:[0,"{PATH} can't be negative."]
        },
description:{
        type:String,
        required:[true, "{PATH} is required."],
        minlength:[3,"{PATH} must be at least 3 characters."]
        }
},{timestamps:true})

module.exports.Product = mongoose.model("Product", ProductSchema)