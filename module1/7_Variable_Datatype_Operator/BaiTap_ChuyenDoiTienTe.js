let result = 0 ;
function convert() {
    let num = document.getElementById("num").value ;
    let from = document.getElementById('from').value ;
    let to = document.getElementById('to').value ;


    if (from === "VNĐ" && to=== "USD") {
        result= num / 23000 ;
    } else if (from === "USD" && to === "VNĐ") {
        result = num * 23000 ;
    } else {
        result = 0 ;
    }
    document.getElementById("result").innerText = result ;
}