package repository.employee;

import model.customer_employee.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/case_study_2";
    private String jdbcUsername = "root";
    private String jdbcPassword = "khanhduyen2102";

    private static final String GET_ALL_POSITION = "select * from position_employee";
    private static final String GET_ALL_EDUCATION_DEGREE = "SELECT * FROM case_study_2.education_degree";
    private static final String GET_ALL_DIVISION = "select * from division";
    private static final String GET_ALL_USER = "select* from user";
    private static final String SAVE_EMPLOYEE = "insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,username) values(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String GET_ALL_EMPLOYEE = "select * from employee";
    private static final String GET_EMPLOYEE_BY_ID = "select * from employee where employee_id = ?";
    private static final String EDIT_EMPLOYEE = "update employee set employee_name = ?, employee_birthday = ?, employee_id_card = ?,employee_salary = ?,employee_phone = ?,employee_email = ?,employee_address = ?,position_id = ?,education_degree_id = ?, division_id= ?,username = ? where employee_id = ?";
    private static final String DELETE_EMPLOYEE = "delete from employee where employee_id = ?";

    public EmployeeRepository(){

    }

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public List getALlEmployee() {
        List list = new ArrayList();
        List<Employee> listEmployee = new ArrayList<>();
        List<Users> listUsers = new ArrayList<>();
        Users users = null;
        List<PositionEmployee> listPosition = new ArrayList<>();
        List<EducationDegree> listEducation = new ArrayList<>();
        List<Division> listDivision = new ArrayList<>();
        Employee employee = null;
        PositionEmployee positionEmployee = null;
        EducationDegree educationDegree = null;
        Division division = null;
        Connection connection = null;
        CallableStatement callableStatement = null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            callableStatement = connection.prepareCall(GET_ALL_EMPLOYEE);
            ResultSet rs = callableStatement.executeQuery();
            callableStatement = connection.prepareCall(GET_ALL_POSITION);
            ResultSet rs2 = callableStatement.executeQuery();
            callableStatement = connection.prepareCall(GET_ALL_EDUCATION_DEGREE);
            ResultSet rs3 = callableStatement.executeQuery();
            callableStatement = connection.prepareCall(GET_ALL_DIVISION);
            ResultSet rs4 = callableStatement.executeQuery();
            callableStatement = connection.prepareCall(GET_ALL_USER);
            ResultSet rs5 = callableStatement.executeQuery();
            connection.commit();
            connection.setAutoCommit(true);
            while (rs.next()){
                employee = new Employee();
                employee.setId(rs.getInt("employee_id"));
                employee.setName(rs.getString("employee_name"));
                employee.setId_card(rs.getString("employee_id_card"));
                employee.setSalary(rs.getDouble("employee_salary"));
                employee.setPhone(rs.getString("employee_phone"));
                employee.setEmail(rs.getString("employee_email"));
                employee.setAddress(rs.getString("employee_address"));
                employee.setPosition_id(rs.getInt("position_id"));
                employee.setEducation_degree_id(rs.getInt("education_degree_id"));
                employee.setDivision_id(rs.getInt("division_id"));
                employee.setUserName(rs.getString("username"));
                employee.setBirthday(rs.getString("employee_birthday"));
                employee.setUserName(rs.getString("username"));
                listEmployee.add(employee);
            }
            while (rs2.next()){
                positionEmployee = new PositionEmployee();
                positionEmployee.setPosition_id(rs2.getInt("position_id"));
                positionEmployee.setPosition_name(rs2.getString("position_name"));
                listPosition.add(positionEmployee);
            }
            while (rs3.next()){
                educationDegree = new EducationDegree();
                educationDegree.setEducation_degree_id(rs3.getInt("education_degree_id"));
                educationDegree.setEducation_degree_name(rs3.getString("education_degree_name"));
                listEducation.add(educationDegree);
            }
            while (rs4.next()){
                division = new Division();
                division.setDivision_id(rs4.getInt("division_id"));
                division.setDivision_name(rs4.getString("division_name"));
                listDivision.add(division);
            }
            while (rs5.next()){
                users = new Users();
                users.setUserName(rs5.getString("username"));
                users.setPassword(rs5.getString("password"));
                listUsers.add(users);
            }
            list.add(listEmployee);
            list.add(listPosition);
            list.add(listEducation);
            list.add(listDivision);
            list.add(listUsers);
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(SAVE_EMPLOYEE);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,employee.getId_card());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5,employee.getPhone());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setInt(8,employee.getPosition_id());
            preparedStatement.setInt(9,employee.getEducation_degree_id());
            preparedStatement.setInt(10,employee.getDivision_id());
            preparedStatement.setString(11,employee.getUserName());
            preparedStatement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Employee getEmployee(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Employee employee = null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(GET_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            connection.commit();
            connection.setAutoCommit(true);
            while (rs.next()){
                employee = new Employee();
                employee.setId(rs.getInt("employee_id"));
                employee.setName(rs.getString("employee_name"));
                employee.setId_card(rs.getString("employee_id_card"));
                employee.setSalary(rs.getDouble("employee_salary"));
                employee.setPhone(rs.getString("employee_phone"));
                employee.setEmail(rs.getString("employee_email"));
                employee.setAddress(rs.getString("employee_address"));
                employee.setPosition_id(rs.getInt("position_id"));
                employee.setEducation_degree_id(rs.getInt("education_degree_id"));
                employee.setDivision_id(rs.getInt("division_id"));
                employee.setUserName(rs.getString("username"));
                employee.setBirthday(rs.getString("employee_birthday"));
                employee.setUserName(rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employee;
    }

    @Override
    public void saveEdit(Employee employee) {
        Connection connection =  null;
        PreparedStatement preparedStatement  = null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(EDIT_EMPLOYEE);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,employee.getId_card());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5,employee.getPhone());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setInt(8,employee.getPosition_id());
            preparedStatement.setInt(9,employee.getEducation_degree_id());
            preparedStatement.setInt(10,employee.getDivision_id());
            preparedStatement.setString(11,employee.getUserName());
            preparedStatement.setInt(12,employee.getId());
            preparedStatement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteEmployee(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement =  null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

//    @Override
//    public void insertEmployee(Employee employee) throws SQLException {
//        System.out.println(INSERT_EMPLOYEE_SQL);
//        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
//            preparedStatement.setString(1, employee.getEmployee_name());
//            preparedStatement.setString(2, employee.getEmployee_birthday());
//            preparedStatement.setString(3, employee.getEmployee_id_card());
//            preparedStatement.setDouble(4, employee.getEmployee_salary());
//            preparedStatement.setString(5, employee.getEmployee_phone());
//            preparedStatement.setString(6, employee.getEmployee_email());
//            preparedStatement.setString(7, employee.getEmployee_address());
//            preparedStatement.setInt(8, employee.getPosition_id());
//            preparedStatement.setInt(9, employee.getEducation_degree_id());
//            preparedStatement.setInt(10, employee.getDivision_id());
//            preparedStatement.setString(11, employee.getUsername());
//            System.out.println(preparedStatement);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//    }
//
//    @Override
//    public Employee selectEmployee(int employee_id) {
//        Employee employee = null;
//        try (Connection connection = getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);) {
//            preparedStatement.setInt(1, employee_id);
//            System.out.println(preparedStatement);
//            ResultSet rs = preparedStatement.executeQuery();
//
//            while (rs.next()) {
//                String employee_name = rs.getString("employee_name");
//                String employee_birthday = rs.getString("employee_birthday");
//                String employee_id_card = rs.getString("employee_id_card");
//                double employee_salary = rs.getDouble("employee_salary");
//                String employee_phone = rs.getString("employee_phone");
//                String employee_email = rs.getString("employee_email");
//                String employee_address = rs.getString("employee_address");
//                int position_id = rs.getInt("position_id");
//                int education_degree_id = rs.getInt("education_degree_id");
//                int division_id = rs.getInt("division_id");
//                String username = rs.getString("username");
//                employee = new Employee(employee_id, employee_name, employee_birthday, employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,username);
//            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//        return employee;
//    }
//
//    @Override
//    public List<Employee> selectAllEmployee() {
//        List<Employee> employees = new ArrayList<>();
//        try (Connection connection = getConnection();
//
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);) {
//            System.out.println(preparedStatement);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                int employee_id = rs.getInt("employee_id");
//                String employee_name = rs.getString("employee_name");
//                String employee_birthday = rs.getString("employee_birthday");
//                String employee_id_card = rs.getString("employee_id_card");
//                double employee_salary = rs.getDouble("employee_salary");
//                String employee_phone = rs.getString("employee_phone");
//                String employee_email = rs.getString("employee_email");
//                String employee_address = rs.getString("employee_address");
//                int position_id = rs.getInt("position_id");
//                int education_degree_id = rs.getInt("education_degree_id");
//                int division_id = rs.getInt("division_id");
//                String username = rs.getString("username");
//                employees.add(new Employee(employee_id, employee_name, employee_birthday, employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,username));
//            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//        return employees;
//    }
//
//    @Override
//    public boolean deleteEmployee(int employee_id) throws SQLException {
//        boolean rowDeleted;
//        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);) {
//            statement.setInt(1, employee_id);
//            rowDeleted = statement.executeUpdate() > 0;
//        }
//        return rowDeleted;    }
//
//    @Override
//    public boolean updateEmployee(Employee employee) throws SQLException {
//        boolean rowUpdated;
//        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL);) {
//            statement.setInt(1,employee.getEmployee_id());
//            statement.setString(2, employee.getEmployee_name());
//            statement.setString(3, employee.getEmployee_birthday());
//            statement.setString(4, employee.getEmployee_id_card());
//            statement.setDouble(5, employee.getEmployee_salary());
//            statement.setString(6, employee.getEmployee_phone());
//            statement.setString(7, employee.getEmployee_email());
//            statement.setString(8, employee.getEmployee_address());
//            statement.setInt(9, employee.getPosition_id());
//            statement.setInt(10, employee.getEducation_degree_id());
//            statement.setInt(11, employee.getDivision_id());
//            statement.setString(12, employee.getUsername());
//
//            rowUpdated = statement.executeUpdate() > 0;
//        }
//        return rowUpdated;
//    }
//
//    @Override
//    public Employee getEmployeeById(int employee_id) {
//        Employee employee = null;
//        String query = "{CALL get_employee_by_id(?)}";
//        try (Connection connection = getConnection();
//             CallableStatement callableStatement = connection.prepareCall(query);) {
//            callableStatement.setInt(1, employee_id);
//            ResultSet rs = callableStatement.executeQuery();
//            while (rs.next()) {
//                String employee_name = rs.getString("employee_name");
//                String employee_birthday = rs.getString("employee_birthday");
//                String employee_id_card = rs.getString("employee_id_card");
//                double employee_salary = rs.getDouble("employee_salary");
//                String employee_phone = rs.getString("employee_phone");
//                String employee_email = rs.getString("employee_email");
//                String employee_address = rs.getString("employee_address");
//                int position_id = rs.getInt("position_id");
//                int education_degree_id = rs.getInt("education_degree_id");
//                int division_id = rs.getInt("division_id");
//                String username = rs.getString("username");
//                employee = new Employee(employee_id, employee_name, employee_birthday, employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,username);            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//        return employee;
//    }
//
//    @Override
//    public void insertEmployeeStore(Employee employee) throws Exception {
//        String query = "{CALL insert_employee(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
//        try (Connection connection = getConnection();
//             CallableStatement callableStatement = connection.prepareCall(query);) {
//            callableStatement.setString(1, employee.getEmployee_name());
//            callableStatement.setString(2, employee.getEmployee_birthday());
//            callableStatement.setString(3, employee.getEmployee_id_card());
//            callableStatement.setDouble(4, employee.getEmployee_salary());
//            callableStatement.setString(5, employee.getEmployee_phone());
//            callableStatement.setString(6, employee.getEmployee_email());
//            callableStatement.setString(7, employee.getEmployee_address());
//            callableStatement.setInt(8, employee.getPosition_id());
//            callableStatement.setInt(9, employee.getEducation_degree_id());
//            callableStatement.setInt(10, employee.getDivision_id());
//            callableStatement.setString(11, employee.getUsername());
//            System.out.println(callableStatement);
//            callableStatement.executeUpdate();
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//    }
//    private void printSQLException(SQLException ex) {
//        for (Throwable e : ex) {
//            if (e instanceof SQLException) {
//                e.printStackTrace(System.err);
//                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//                System.err.println("Message: " + e.getMessage());
//                Throwable t = ex.getCause();
//                while (t != null) {
//                    System.out.println("Cause: " + t);
//                    t = t.getCause();
//                }
//            }
//        }
//    }

