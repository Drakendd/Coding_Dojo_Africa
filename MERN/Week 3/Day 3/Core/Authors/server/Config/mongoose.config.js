const mongoose = require("mongoose");
const DB_NAME = process.env.db;
const username =process.env.ATLAS_USERNAME
const pw =process.env.ATLAS_PASSWORD
    // connect to data base
    const uri =`mongodb+srv://${username}:${pw}@cluster0.ywix3sj.mongodb.net/${DB_NAME}?retryWrites=true&w=majority&appName=Cluster0`
    mongoose.connect(uri)

        .then(() => { console.log(`Established a connection to the database ${DB_NAME} `) })
        .catch((err) => {console.log(`There was a problem connecting to db ${DB_NAME}`,err)})
