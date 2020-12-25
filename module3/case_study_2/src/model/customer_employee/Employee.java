package model.customer_employee;

public class Employee extends Customer_Employee {
    private double salary;
    private int position_id;
    private int education_degree_id;
    private int division_id;
    private String userName;

    public Employee(){

    }

    public Employee(double salary, int position_id, int education_degree_id, int division_id, String userName) {
        this.salary = salary;
        this.position_id = position_id;
        this.education_degree_id = education_degree_id;
        this.division_id = division_id;
        this.userName = userName;
    }

    public Employee(int id, String name, String birthday, String id_card, String phone, String email, String address, double salary, int position_id, int education_degree_id, int division_id, String userName) {
        super(id, name, birthday, id_card, phone, email, address);
        this.salary = salary;
        this.position_id = position_id;
        this.education_degree_id = education_degree_id;
        this.division_id = division_id;
        this.userName = userName;
    }

    public Employee(String name, String birthday, String id_card, String phone, String email, String address, double salary, int position_id, int education_degree_id, int division_id, String userName) {
        super(name, birthday, id_card, phone, email, address);
        this.salary = salary;
        this.position_id = position_id;
        this.education_degree_id = education_degree_id;
        this.division_id = division_id;
        this.userName = userName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(int education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public int getDivision_id() {
        return division_id;
    }

    public void setDivision_id(int division_id) {
        this.division_id = division_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
