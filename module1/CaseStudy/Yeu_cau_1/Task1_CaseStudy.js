let lastName = document.getElementById("lastName");
let firstName = document.getElementById("firstName");
let email = document.getElementById("email");
let secondEmail = document.getElementById("secondEmail");
let phone = document.getElementById("phone");
let fax = document.getElementById("fax");
let companyName = document.getElementById("companyName");
let nationality = document.getElementById("nationality");
let city = document.getElementById("city");
let checkin = document.getElementById("checkin");
let checkout = document.getElementById("checkout");
let chooseSv = document.getElementById("vip");
let chooseRoom = document.getElementById("room");
let adults = document.getElementById("adults");
let chills = document.getElementById("child");
let rentday = document.getElementById("rentday");
let discount = document.getElementById("discount");

function booking() {
    let result = rentday.value * chooseRoom.value * (1 - discount.value/100);
    alert("Last name : "+lastName.value +"\n"+"First name : "+firstName.value+"\n"+"Email : "+email.value+"\n"+"Second Email : "+secondEmail.value+"\n"+"Phone : "+phone.value+"\n"+"Fax : "+fax.value+"\n"+"Company Name : "+companyName.value+"\n"+
        "Nationality : "+nationality.value+"\n"+"City : "+city.value+ "\n"+"Check in : "+checkin.value+"\n"+"Check out : "+checkout.value+"\n"+"Choose Sv : "+chooseSv.value+"\n"+
        "Adults : "+adults.value+"\n"+"Chills : "+chills.value+"\n"+"Rentday : "+rentday.value+"\n"+"Discount : "+discount.value+"\n"+"Tổng tiền phải trả là : "+result);
}