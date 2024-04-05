class Ninja{
    constructor(name,health){
        this.name = name;
        this.health= health;
        this.speed=3
        this.strength=3
    }

sayName(){
    console.log(` my name is ${this.name}`);
    return this
}
showStats(){
    console.log(`${this.name} has ${this.health} speed ${this.speed} strength ${this.strength}`)
    return this
}
drinkSake() {
    console.log(`${this.name} drank sake.`);
    this.health += 10;
    return this;
}
}
const ninja1 = new Ninja("Hyabusa","good");
ninja1.sayName().showStats().drinkSake().showStats();