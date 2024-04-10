//1
var example;
console.log(example);// `example` is `undefined`
example = "I'm the example!";
console.log(example);
// Predicted output:
// undefined
// "I'm the example!"
//part1 :
console.log(hello);
var hello = 'world';
//part2:
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}
//part3:
var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);
//part4:
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}
//part5:
mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);
//part6:
console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);

//part7:
dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);
