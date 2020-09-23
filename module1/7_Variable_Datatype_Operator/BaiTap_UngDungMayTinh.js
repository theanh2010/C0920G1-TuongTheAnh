function add() {
    let num1 = document.getElementById('num1');
    let num2 = document.getElementById('num2');
    let result;
    alert(result = parseInt(num1.value)+parseInt(num2.value))
}
function sub() {
    let num1 = document.getElementById('num1');
    let num2 = document.getElementById('num2');
    let result;
    alert(result = num1.value - num2.value)
}
function mul() {
    let num1 = document.getElementById('num1');
    let num2 = document.getElementById('num2');
    let result;
    alert(result = num1.value * num2.value)
}
function div() {
    let num1 = document.getElementById('num1');
    let num2 = document.getElementById('num2');
    let result;
    if (num2.value == 0) {
        result = "phép chia không thể chia cho 0"
    } else {
        result = num1.value / num2.value;
    }
    alert(result)
}