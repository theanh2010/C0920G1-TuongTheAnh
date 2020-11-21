package case_study.commons.comparator;

import case_study.models.customer.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortNameCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        if(customer1.getNameCustomer().equals(customer2.getNameCustomer())){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = simpleDateFormat.parse(customer1.getBirthday());
                date2 = simpleDateFormat.parse(customer2.getBirthday());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (date1.compareTo(date2) == 0){
                return customer1.getNameCustomer().compareTo(customer2.getNameCustomer());
            }else {
                return date1.compareTo(date2);
            }
        }
        return customer1.getNameCustomer().compareTo(customer2.getNameCustomer());
    }
}
