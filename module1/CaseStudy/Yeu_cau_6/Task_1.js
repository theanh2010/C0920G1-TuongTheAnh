class Customer {
    constructor(name, cmnd, birthday, email, address, typeSv, typeRoom, typeCustomer, discount, quantityIncluded, rentDays) {
        this.name = name;
        this.cmnd = cmnd;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.typeSv = typeSv;
        this.typeRoom = typeRoom;
        this.typeCustomer = typeCustomer;
        this.discount = discount;
        this.quantityIncluded = quantityIncluded;
        this.rentDays = rentDays
    };

    getName() {
        return this.name;
    }
    getCmnd() {
        return this.cmnd;
    }
    getBirthday() {
        return this.birthday;
    }

    getEmail() {
        return this.email;
    }

    getAddress() {
        return this.address;
    }

    getTypeSv() {
        return this.typeSv;
    }

    getTypeRoom() {
        return this.typeRoom;
    }

    getTypeCustomer() {
        return this.typeCustomer;
    }

    getDiscount() {
        return this.discount;
    }

    getQuantityIncluded() {
        return this.quantityIncluded;
    }

    getRentdays() {
        return this.rentDays;
    }

    getTotalPay() {
        let money = 0;
        if (this.typeSv === "Villa") {
            money = 500;
        } else if (this.typeSv === "House") {
            money = 300;
        } else if (this.typeSv === "Room") {
            money = 200;
        }
        return this.rentDays * money * (1 - this.discount / 100);
    }

    setName(name) {
        return this.name = name;
    }

    setCmnd(cmnd) {
        return this.cmnd = cmnd;
    }
    setEmail(email){
        return this.email = email;
    }

    setAddress(address) {
        return this.address = address;
    }

    setTypeSv(typeSv) {
        return this.typeSv = typeSv;
    }

    setTypeRoom(typeRoom) {
        return this.typeRoom = typeRoom;
    }

    setTypeCustomer(typeCustomer) {
        return this.typeCustomer = typeCustomer;
    }

    setDiscount(discount) {
        return this.discount = discount;
    }

    setQuantityIncluded(quantityIncluded) {
        return this.quantityIncluded = quantityIncluded;
    }

    setRentdays(rentdays) {
        return this.rentdays = rentdays;
    }
}
class Employee1 {
    constructor(name1,birthday,cmnd,phone1,email,level1,position1) {
        this.name1 = name1;
        this.birthday = birthday;
        this.cmnd = cmnd;
        this.phone1 = phone1;
        this. email = email;
        this.level1 = level1;
        this.position1 = position1;
    };
    getName1(){
        return this.name1;
    }
    getBirthday(){
        return this.birthday;
    }
    getCmnd(){
        return this.cmnd;
    }
    getPhone1(){
        return this.phone1;
    }
    getEmail(){
        return this.email;
    }
    getLevel1(){
        return this.level1;
    }
    getPosition1(){
        return this.position1;
    }
    getSalary(){
        if (this.position1==="Manager"){
            this.salary = 500 ;
        }else if (this.position1==="Sale"){
            this.salary = 300 ;
        }else if (this.position1==="Marketing"){
            this.salary = 200 ;
        }
        return this.salary;

    }
}