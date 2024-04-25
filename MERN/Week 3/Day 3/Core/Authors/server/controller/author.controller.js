const Author =require("../models/author.model")

//============================ bild function ------all this function is a promess so evry one need .then and .catch 


// bild function to get all --------------------------------
module.exports.findAllAuthor = (request, respensepense) =>{
    Author.find()
    .then((allAuthor)=>{ 
        respensepense.json(allAuthor) }) // array of object  i can use just objet and sand other parameter   respense.json({allAuthor , status :"ok" })
        .catch((err)=>{res.status(400).res.json(err , {message :"something wnt wrong with add new author" })})

}

// bild function to get one by id --------------------------------
module.exports.findOneById = (request, respense) =>{
    Author.findById({_id : request.params.id})
    .then((OneAuthor)=>{ 
        respense.json(OneAuthor) }) // array of object  i can use just objet and sand other parameter   respense.json({OneAuthor , status :"ok" })
        .catch((err)=>{res.status(400).respensepense.json(err , {message :"something wnt wrong with add new author"})})
}

// bild function to create new Author --------------------------------
module.exports.CreateAuthor = (request, respense) =>{
    Author.create(request.body)
    .then((NewAuthor)=>{ 
        respense.json({NewAuthor})}) // array of object  i can use just objet and sand other parameter   respense.json({NewAuthor: Author })
        .catch((err)=>{res.status(400).respensepense.json(err , {message :"something wnt wrong with add new author"})})
}

// bild function to update Author ----------------------------------
module.exports.updateAuthor = (request, respense) => {
    Author.findOneAndUpdate(
        { _id: request.params.id },
        request.body,
        { new: true, runValidators: true }
    )
        .then(upAuthor => respense.json(upAuthor ))
        .catch((err)=>{respense.status(400).respense.json(err , {message :"something wnt wrong with add new author" })})
}

// bild function to delete Author ----------------------------------
module.exports.deleteAuthor = (request, respense) => {
    Author.findByIdAndDelete({ _id: request.params.id })
        .then(delAuthor => respense.json(delAuthor ))
        .catch((err)=>{respense.status(400).respense.json(err , {message :"something wnt wrong with add new author"})})
}












