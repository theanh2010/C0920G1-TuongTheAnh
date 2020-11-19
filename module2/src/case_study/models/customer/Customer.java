package case_study.models.customer;

import case_study.models.services.Services;

public class Customer  {
    int id;
    String idCard;
    String nameCustomer ;
    String birthday;
    String cmnd;
    String phoneNumber;
    String email;
    String typeCustomer;
    String address;
    public Customer(int id , String nameCustomer, String birthday, String cmnd, String phoneNumber, String email, String typeCustomer, String adress ) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = adress;
    }

    public Customer() {
    }


    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     public String showInfor(){
         return this.toString();
     }

    @Override
    public String toString() {
        return
                " Id : " + id + "\n" +
                " Name Customer : " + nameCustomer + '\n' +
                " Birthday : " + birthday + '\n' +
                " Cmnd : " + cmnd + '\n' +
                " PhoneNumber : " + phoneNumber + '\n' +
                " Email : " + email + '\n' +
                " Type Customer : " + typeCustomer + '\n' +
                " Address : " + address + "\n" +
                "--------------------------------------------------";

    }
}
