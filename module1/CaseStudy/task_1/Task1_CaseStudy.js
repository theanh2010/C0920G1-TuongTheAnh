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

function booking() {
    document.getElementById("information1").innerText = lastName.value;
    document.getElementById("information2").innerText = firstName.value;
    document.getElementById("information3").innerText = email.value;
    document.getElementById("information4").innerText = secondEmail.value;
    document.getElementById("information5").innerText = phone.value;
    document.getElementById("information6").innerText = fax.value;
    document.getElementById("information7").innerText = companyName.value;
    document.getElementById("information8").innerText = nationality.value;
    document.getElementById("information9").innerText = city.value;
    document.getElementById("information10").innerText = checkin.value;
    document.getElementById("information11").innerText = checkout.value;
    document.getElementById("information12").innerText = chooseSv.value;
    document.getElementById("information13").innerText = chooseRoom.value;
    document.getElementById("information14").innerText = adults.value;
    document.getElementById("information15").innerText = chills.value;

}