//1. import mongoose 
const mongoose = require("mongoose")
//!!!!schema
const jokeSchema = new mongoose.Schema({
setup : String,
punchline :String,
})
const Joke = mongoose.model("Joker" , jokeSchema);
module.exports = Joke;