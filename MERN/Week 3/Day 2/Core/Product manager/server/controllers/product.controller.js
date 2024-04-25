const {Product}=require('../models/product.model')
//* GET ALL *
module.exports.getAll=(req, res)=>{
    Product.find()
        .then(obj=>{res.json(obj);res.status(201)})
        .catch(err=>{res.status(400);console.log(res.json(err))})
}
//* GET ONE *

module.exports.getOne=(req,res)=>{
    Product.findOne({_id:req.params.id})
        .then(obj=>res.json(obj))
        .catch(err=>{res.status(404);console.log(res.json(err))})

}

//* UPDATE *

module.exports.update=(req,res)=>{
    Product.updateOne({_id:req.params.id},req.body,{new:true, runValidators:true})
    .then (obj=>res.json(obj))
    .catch (err=>{res.status(400);console.log(res.json(err))})
}

//* DELETE *

module.exports.delete=(req,res)=>{
    Product.deleteOne({_id:req.params.id})
        .then(obj=>res.json(obj))
        .catch(err=>{res.status(404);console.log(res.json(err))})
}

//* CREATE *

module.exports.create=(req,res)=>{
    Product.create(req.body)
        .then(obj=>{res.json(obj);res.status(201)})
        .catch(err=>{res.status(400);console.log(res.json(err))})
}

