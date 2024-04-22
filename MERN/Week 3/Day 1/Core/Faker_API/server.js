const express = require("express");
const app = express();
const port = 8000;
const { faker } = require("@faker-js/faker")



const CrateUser = () => {
    const User = {
        password: faker.internet.password(),
        email: faker.internet.email(),
        phoneNumber: faker.phone.number(),
        lastName: faker.name.lastName(),
        firstName: faker.name.firstName(),
        _id: faker.datatype.uuid(),
    }
}

const CrateCompany = () => {
    const Company = {
        name: faker.company.name(),
        _id: faker.datatype.uuid(),
        phoneNumber: faker.phone.number(),
        address: {
            street: faker.address.street(),
            city: faker.address.city(),
            zipCode: faker.address.zipCode(),
            country: faker.address.country(),

        }
    }
}

const newCompany = CrateCompany();



app.get("/api", (req, res) => {
    res.json({ message: "Hello World" });
});

app.get("/api/users/new", (req, res) => {
    return res.json({ message: "user" });

});

app.get("/api/companies/new", (req, res) => {

    res.json({ message: "newCompany" });

});

app.get("/api/user/company", (req, res) => {


    res.json({ newCompany });

});

app.listen(port, () => console.log(`Listening on port: ${port}`));