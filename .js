
for (let i = 1; i <= 20; i += 2) {
    console.log("Odd:", i);
}


for (let i = 100; i >= 0; i -= 3) {
    if (i % 3 === 0) {
        console.log("Multiple of 3:", i);
    }
}


const sequence = [4, 2.5, 1, -0.5, -2, -3.5];
for (let i = 0; i < sequence.length; i++) {
    console.log("Sequence:", sequence[i]);
}
let sum = 0;
for (let i = 1; i <= 100; i++) {
    sum += i;
}
console.log("Sigma:", sum);


let product = 1;
for (let i = 1; i <= 12; i++) {
    product *= i;
}
console.log("Factorial:", product);

