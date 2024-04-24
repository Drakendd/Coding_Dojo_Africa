const express = require("express")
const app = express()
const PORT = 8000
const DB_NAME = "jokes"
//MIDDELWARE
app.use(express.json(), express.urlencoded({ extended: true }));
// Connection to the DataBase
require("./config/mongoose.config")(DB_NAME)
require("./routes/jokes.routes")(app)

app.listen(PORT,() =>{ console.log(`Server started on PORT ${PORT}`)})