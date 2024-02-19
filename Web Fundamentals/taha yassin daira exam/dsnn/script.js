function hide(element) {
    element.remove();
}
function add(e) {
    e.innerText++;
}
const myTimeout = setTimeout(myGreeting, 13000);

function myGreeting() {

    alert("The ninjas have won")
}