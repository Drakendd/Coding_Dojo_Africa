class Ninja{
    constructor(name,health)
    {
        this.name = name;
        this.health= health;
        this.speed=3
        this.strength=3
    }

sayName()
{
    console.log(` my name is ${this.name}`);
    return this
}
showStats()
{
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

class Sensei extends Ninja{
    constructor(name,health, speed, strength, wisdom ){
        super(name, health)
        this.speed=10
        this.strength=10
        this.wisdom = wisdom || 10
    }
}

speakWisdom()
{
    console.log(`What one programmer can do in one month, two programmers can do in two months. `);
}
showStats();
{
    console.log(`Name: ${this.name}, Health: ${this.health} Speed:${this.speed} ,Strength:${this.strength} `);
}
// example output
const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
superSensei.showStats();