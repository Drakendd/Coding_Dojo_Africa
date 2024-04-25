// import the controller 
const autherController = require("../controller/author.controller")

// =============================creat routs

module.exports =(app)=>{ //  we should be group all routes 
    // create route to add one
    app.post("/api/authors", autherController.CreateAuthor);
    
    //create route for get all 
    app.get("/api/authors", autherController.findAllAuthor) 
    
    // create route for get one by id
    app.get("/api/authors/:id", autherController.findOneById);

    // create route to update one
    app.put("/api/authors/:id", autherController.updateAuthor)

    // create route to update one
    app.delete("/api/authors/:id", autherController.deleteAuthor)




} 






























// create route to delete one
//app.delete("/api/notes/delete/:_id", autherController.deleteNote);//ok