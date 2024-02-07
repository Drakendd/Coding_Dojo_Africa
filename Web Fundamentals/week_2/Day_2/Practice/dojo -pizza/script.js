// create a function called pizzaoven that return a (pizza) object.

function pizzaFactory(crusttype, saucetype, cheese, toppings) {
    var pizza = {};
    pizza.crusttype = crusttype;
    pizza.saucetype = saucetype;
    pizza.cheese = cheese;
    pizza.toppings = toppings;
    return pizza;
}
// create a pizza with :"deep dish","traditional","["mozzarella"],and["pepperoni"",sausage"]
pizza={
    crusttype : "deep dish",
    saucetype : "traditional",
    cheese : ["mozzarella"],
    toppings : ["pepperoni","sausage"],


}
console.log(pizza)
// Create a pizza with: "deep dish", "traditional", ["mozzarella"], and ["pepperoni", "sausage"]
pizza={
    crusttype : "hand tossed",
    saucetype : "marinara",
    cheese : ["mozzarella", "feta"],
    toppings : ["mushrooms", "olives", "onions"],


}
console.log(pizza) 

// 2 more pizzas
pizza2={
    crusttype : "hand tossed",
    saucetype : "marinara",
    cheese : ["mozzarella", "feta"],
    toppings : ["mushrooms", "olives", "onions"],


}
console.log(pizza2) 
pizza3={
    crusttype : "hand tossed",
    saucetype : "marinara",
    cheese : ["mozzarella", "feta"],
    toppings : ["mushrooms", "olives", "onions"],


}
console.log(pizza3)