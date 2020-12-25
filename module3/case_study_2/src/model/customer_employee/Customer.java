package model.customer_employee;

public class Customer extends Customer_Employee {
    protected int customer_type_id;
    protected String customer_gender;

    public Customer(){
    }

    public Customer(int id, String name, String birthday, String id_card, String phone, String email, String address) {
        super(id, name, birthday, id_card, phone, email, address);
    }

    public Customer(String name, String birthday, String id_card, String phone, String email, String address) {
        super(name, birthday, id_card, phone, email, address);
    }

    public Customer(String name, String birthday, String id_card, String phone, String email, String address, int customer_type_id, String customer_gender) {
        super(name, birthday, id_card, phone, email, address);
        this.customer_type_id = customer_type_id;
        this.customer_gender = customer_gender;
    }

    public int getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(int customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(String customer_gender) {
        this.customer_gender = customer_gender;
    }
}
