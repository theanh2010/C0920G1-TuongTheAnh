import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Tưởng Thế Anh","20-10-1997","Đà Nẵng","src/20201215_101503.jpg"));
        customerList.add(new Customer(2,"Ngọc Anh","20-10-1997","Đà Nẵng","src/20201215_101503.jpg"));
        customerList.add(new Customer(3,"Lê Minh Chiến","20-10-1997","Đà Nẵng","src/20201215_101503.jpg"));
        customerList.add(new Customer(4,"Nguyễn Đình Phúc","20-10-1997","Đà Nẵng","src/20201215_101503.jpg"));
        customerList.add(new Customer(5,"Phúc Khang","20-10-1997","Đà Nẵng","src/20201215_101503.jpg"));
    }

    public static List<Customer> getCustomerList{
        return customerList;
    }
}
