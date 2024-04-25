const express = require("express");         // import express
const app = express();                     // declar app
const cors = require("cors");  
require("dotenv").config()          // import middelwere to connect tow server 
// global varibol ==================================================================
const PORT = process.env.PORT ;                       // porte how server youse / or ||processe.env.PORT

// middelware
app.use(express.json(),express.urlencoded({extended:true}),cors());

// Connect to the DB ---------
require("./Config/mongoose.config")

// import the toutes ---
require("./routes/author.routes")(app)

// ----------------------------------------------------------------------
app.listen(PORT, () => { console.log(`Server started on PORT ${PORT} 🚀🚀`) })

