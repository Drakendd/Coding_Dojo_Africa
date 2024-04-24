// CRUD
const Joke =require("../models/joke.model")

module.exports.findAllJokes = (request, respense) =>{
    Joke.find()
    .then((allJokes)=>{ 
        respense.json(allJokes) })
    .catch((err)=>{ 
        respense.json({message :"something wnt wrong" , serverError : err})})
}

module.exports.findOneById = (request, respense) =>{
    Joke.findById({_id : request.params._id})
    .then((OneJoke)=>{ 
        respense.json({ joke:OneJoke}) })
    .catch((err)=>{ 
        respense.json({message :"something wnt wrong" , serverError : err})})
}
module.exports.CreateJoke = (request, respense) =>{
    Joke.create(request.body)
    .then((NewJoke)=>{ 
        respense.json({NewJoke})}) 
    .catch((err)=>{ 
        respense.json({message :"something wnt wrong" , serverError : err})})
}
// update
module.exports.updateJoke = (request, res) => {
    Joke.findByIdAndUpdate(
        { _id: request.params._id },
        request.body,
        { new: true, runValidators: true }
    )
        .then(upJoke => res.json({ Joke: upJoke }))
        .catch(err => res.json({ message: 'Something went wrong', error: err }));
}
//Delete Joke
module.exports.deleteJoke = (request, res) => {
    Joke.findByIdAndDelete({ _id: request.params._id })
        .then(delJoke => res.json({ Joke: delJoke }))
        .catch(err => res.json({ message: 'Something went wrong', error: err }));
}
//Random jokes
module.exports.randomJoke = (request, res) => {
    Joke.aggregate({$sample:{size:1}})
        .then(delJoke => res.json({ Joke: delJoke }))
        .catch(err => res.json({ message: 'Something went wrong', error: err }));
}