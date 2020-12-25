package repository.customer;

import model.customer_employee.Customer;
import model.customer_employee.CustomerType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/case_study_2";
    private String jdbcUsername = "root";
    private String jdbcPassword = "khanhduyen2102";
    private static final String GET_ALL_CUSTOMER = "select * from customer";
    private static final String GET_ALL_CUSTOMER_TYPE = "select * from customer_type";
    private static final String CREATE_CUSTOMER = "insert into customer(customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address) values(?,?,?,?,?,?,?,?)";
    private static final String GET_CUSTOMER_BY_ID = "select * from customer where customer_id = ?";

    public CustomerRepository(){
    }

    private Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List getAllCustomer() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Customer customer = null;
        CustomerType customerType = null;
        List list = new ArrayList();
        List<Customer> listCustomer = new ArrayList<>();
        List<CustomerType> listCustomerType = new ArrayList<>();
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            preparedStatement =  connection.prepareStatement(GET_ALL_CUSTOMER);
            ResultSet rs = preparedStatement.executeQuery();
            preparedStatement = connection.prepareStatement(GET_ALL_CUSTOMER_TYPE);
            ResultSet rs1 = preparedStatement.executeQuery();
            connection.commit();
            connection.setAutoCommit(true);
            while (rs.next()){
                //int id, String name, String birthday, String id_card, String phone, String email, String address, String customerType, String gender)

                customer = new Customer();
                customer.setId(rs.getInt("customer_id"));
                customer.setName(rs.getString("customer_name"));
                customer.setBirthday(rs.getString("customer_birthday"));
                customer.setId_card(rs.getString("customer_id_card"));
                customer.setPhone(rs.getString("customer_phone"));
                customer.setEmail(rs.getString("customer_email"));
                customer.setAddress(rs.getString("customer_address"));
                customer.setCustomer_type_id(rs.getInt("customer_type_id"));
                customer.setCustomer_gender(rs.getString("customer_gender"));
                listCustomer.add(customer);
            }
            while (rs1.next()){
                customerType = new CustomerType(rs1.getInt("customer_type_id"), rs1.getString("customer_type_name"));
                listCustomerType.add(customerType);
            }
            list.add(listCustomer);
            list.add(listCustomerType);

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {

                assert preparedStatement != null;
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
        return list;
    }

    @Override
    public void creatCustomer(Customer customer) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(CREATE_CUSTOMER);
            preparedStatement.setInt(1,customer.getCustomer_type_id());
            preparedStatement.setString(2,customer.getName());
            preparedStatement.setString(3,customer.getBirthday());
            preparedStatement.setString(4,customer.getCustomer_gender());
            preparedStatement.setString(5,customer.getId_card());
            preparedStatement.setString(6,customer.getPhone());
            preparedStatement.setString(7,customer.getEmail());
            preparedStatement.setString(8,customer.getAddress());
            preparedStatement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
        }catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                assert preparedStatement != null;
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
    public Customer getCustomer(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Customer customer = null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(GET_CUSTOMER_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                customer = new Customer();
                customer.setId(rs.getInt("customer_id"));
                customer.setCustomer_type_id(rs.getInt("customer_type_id"));
                customer.setName(rs.getString("customer_name"));
                customer.setBirthday(rs.getString("customer_birthday"));
                customer.setCustomer_gender(rs.getString("customer_gender"));
                customer.setId_card(rs.getString("customer_id_card"));
                customer.setPhone(rs.getString("customer_phone"));
                customer.setEmail(rs.getString("customer_email"));
                customer.setAddress(rs.getString("customer_address"));
            }
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
                assert preparedStatement != null;
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
        return customer;
    }
    }
//    @Override
//    public void insertCustomer(Customer customer) throws SQLException {
//        System.out.println(INSERT_CUSTOMER_SQL);
//        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
//            preparedStatement.setInt(1, customer.getCustomer_type_id());
//            preparedStatement.setString(2, customer.getCustomer_name());
//            preparedStatement.setString(3, customer.getCustomer_birthday());
//            preparedStatement.setString(4, customer.getCustomer_gender());
//            preparedStatement.setString(5, customer.getCustomer_id_card());
//            preparedStatement.setString(6, customer.getCustomer_phone());
//            preparedStatement.setString(7, customer.getCustomer_email());
//            preparedStatement.setString(8, customer.getCustomer_address());
//            System.out.println(preparedStatement);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//    }
//
//    @Override
//    public Customer selectCustomer(int customer_id) {
//        Customer customer = null;
//        try (Connection connection = getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);) {
//            preparedStatement.setInt(1, customer_id);
//            System.out.println(preparedStatement);
//            ResultSet rs = preparedStatement.executeQuery();
//
//            while (rs.next()) {
//                int customer_type_id = rs.getInt("customer_type_id");
//                String customer_name = rs.getString("customer_name");
//                String customer_birthday = rs.getString("customer_birthday");
//                String customer_gender = rs.getString("customer_gender");
//                String customer_id_card = rs.getString("customer_id_card");
//                String customer_phone = rs.getString("customer_phone");
//                String customer_email = rs.getString("customer_email");
//                String customer_address = rs.getString("customer_address");
//                customer = new Customer(customer_id, customer_type_id, customer_name, customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address);
//            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//        return customer;
//    }
//
//    @Override
//    public List<Customer> selectAllCustomer() {
//        List<Customer> customers = new ArrayList<>();
//        try (Connection connection = getConnection();
//
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);) {
//            System.out.println(preparedStatement);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                int customer_id = rs.getInt("customer_id");
//                int customer_type_id = rs.getInt("customer_type_id");
//                String customer_name = rs.getString("customer_name");
//                String customer_birthday = rs.getString("customer_birthday");
//                String customer_gender = rs.getString("customer_gender");
//                String customer_id_card = rs.getString("customer_id_card");
//                String customer_phone = rs.getString("customer_phone");
//                String customer_email = rs.getString("customer_email");
//                String customer_address = rs.getString("customer_address");
//                customers.add(new Customer(customer_id, customer_type_id, customer_name, customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address));
//            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//        return customers;
//    }
//
//    @Override
//    public boolean deleteCustomer(int customer_id) throws SQLException {
//        boolean rowDeleted;
//        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_SQL);) {
//            statement.setInt(1, customer_id);
//            rowDeleted = statement.executeUpdate() > 0;
//        }
//        return rowDeleted;
//    }
//
//    @Override
//    public boolean updateCustomer(Customer customer) throws SQLException {
//        boolean rowUpdated;
//        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);) {
//            statement.setInt(1, customer.getCustomer_id());
//            statement.setInt(2, customer.getCustomer_type_id());
//            statement.setString(3, customer.getCustomer_name());
//            statement.setString(4, customer.getCustomer_birthday());
//            statement.setString(5, customer.getCustomer_gender());
//            statement.setString(6, customer.getCustomer_id_card());
//            statement.setString(7, customer.getCustomer_phone());
//            statement.setString(8, customer.getCustomer_email());
//            statement.setString(9, customer.getCustomer_address());
//
//            rowUpdated = statement.executeUpdate() > 0;
//        }
//        return rowUpdated;
//    }
//
//    @Override
//    public Customer getCustomerById(int customer_id) {
//        Customer customer = null;
//        String query = "{CALL get_customer_by_id(?)}";
//        try (Connection connection = getConnection();
//             CallableStatement callableStatement = connection.prepareCall(query);) {
//            callableStatement.setInt(1, customer_id);
//            ResultSet rs = callableStatement.executeQuery();
//            while (rs.next()) {
//                int customer_type_id = rs.getInt("customer_type_id");
//                String customer_name = rs.getString("customer_name");
//                String customer_birthday = rs.getString("customer_birthday");
//                String customer_gender = rs.getString("customer_gender");
//                String customer_id_card = rs.getString("customer_id_card");
//                String customer_phone = rs.getString("customer_phone");
//                String customer_email = rs.getString("customer_email");
//                String customer_address = rs.getString("customer_address");
//                customer= new Customer(customer_id, customer_type_id, customer_name, customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address);
//            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//        return customer;
//    }
//
//    @Override
//    public void insertCustomerStore(Customer customer) throws SQLException {
//        String query = "{CALL insert_customer(?, ?, ?, ?, ?, ?, ?, ?)}";
//        try (Connection connection = getConnection();
//             CallableStatement callableStatement = connection.prepareCall(query);) {
//            callableStatement.setInt(1, customer.getCustomer_type_id());
//            callableStatement.setString(2, customer.getCustomer_name());
//            callableStatement.setString(3, customer.getCustomer_birthday());
//            callableStatement.setString(4, customer.getCustomer_gender());
//            callableStatement.setString(5, customer.getCustomer_id_card());
//            callableStatement.setString(6, customer.getCustomer_phone());
//            callableStatement.setString(7, customer.getCustomer_email());
//            callableStatement.setString(8, customer.getCustomer_address());
//            System.out.println(callableStatement);
//            callableStatement.executeUpdate();
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//    }
//
//
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


