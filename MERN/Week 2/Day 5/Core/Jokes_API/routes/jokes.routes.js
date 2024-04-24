//Import cont
const JokeController = require("../controller/jokes.controller")
//CREATE
module.exports =(app)=>{
    app.get("/api/jokes", JokeController.findAllJokes) 
    app.get("/api/jokes/:_id", JokeController.findOneById);
    app.get("/api/jokes/random", JokeController.findAllJokes);
    app.post("/api/jokes/new", JokeController.CreateJoke);
    app.put("/api/jokes/update/:_id", JokeController.updateJoke);
    app.delete("/api/jokes/delete/:_id", JokeController.deleteJoke);}
