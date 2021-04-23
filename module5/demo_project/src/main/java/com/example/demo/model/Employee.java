package com.example.demo.model;

import javax.persistence.*;
@NamedNativeQuery(
        name = "EmployeeDtoMapping",
        query =
                "SELECT emp.id AS id " +
                        "emp.name AS name " +
                        "emp.birthday AS birthday " +
                        "emp.gender AS gender " +
                        "emp.id_card AS idCard " +
                        "emp.phone AS phone " +
                        "emp.address AS address " +
                        " FROM Employee emp " ,
//                        "WHERE emp.name like %:name%",
        resultSetMapping = "EmployeeMapping"
)
@SqlResultSetMapping(
        name = "EmployeeMapping",
        classes = @ConstructorResult(
                targetClass = EmployeeDto.class,
                columns = {
                        @ColumnResult(name = "id", type = Integer.class),
                        @ColumnResult(name = "name", type = String.class),
                        @ColumnResult(name = "birthday", type = String.class),
                        @ColumnResult(name = "gender", type = String.class),
                        @ColumnResult(name = "idCard", type = String.class),
                        @ColumnResult(name = "phone", type = String.class),
                        @ColumnResult(name = "address", type = String.class)
                }
        )
)
@Entity
@Table(name ="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private String idCard;
    private String phone;
    private String address;

   @ManyToOne
   @JoinColumn(name = "employee_type_id", nullable = false)
   private EmployeeType employeeType;

    public Employee() {
    }

    public Employee(int id, String name, String birthday, String gender, String idCard, String phone, String address, EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.address = address;
        this.employeeType = employeeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
