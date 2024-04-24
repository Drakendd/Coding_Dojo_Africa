//Import mongoose
const mongoose = require("mongoose");

module.exports = (DB_NAME) => {   
    mongoose.connect(`mongodb://localhost/${DB_NAME}`)
        .then(() => { console.log(`all good ,  connection to the database ${DB_NAME} `) })
        .catch((err) => { console.log(`There was a issue connecting to ${DB_NAME}`) })
}