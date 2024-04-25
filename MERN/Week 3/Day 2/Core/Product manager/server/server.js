const express = require('express');
require('dotenv').config();
const cors = require("cors");
const app = express();
const port = process.env.port;
//!MIDDLEWARE 
app.use(express.json(), express.urlencoded({extended:true}),cors());
// CONFIG
require("./config/mongoose.config")
// ROUTES 
require ("./routes/product.routes")(app);
app.listen(port,()=> console.log('LISTENING ON PORT: '+port))