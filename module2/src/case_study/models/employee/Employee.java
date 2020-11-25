package case_study.models.employee;

public class Employee {
    String nameEmployee;
    int ageEmployee;
    String addressEmployee;
    public Employee(){}
    public Employee(String nameEmployee, int ageEmployee, String addressEmployee) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
    }

    public Employee(String nameEmployee, String s, String addressEmployee) {

    }
    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return
                " Name Employee : " + nameEmployee + "\n" +
                " Age Employee : " + ageEmployee + "\n" +
                " Address Employee : " + addressEmployee + "\n"+
                "--------------------------------------------------";
    }
}
