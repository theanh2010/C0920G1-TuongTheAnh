package case_study.manager;

import case_study.commons.file_unit.FileUtils;
import case_study.models.customer.Customer;


import java.util.ArrayList;
import java.util.List;

public class CRODCustomer {
    public void delete (int id){
        Customer customer = null;
        List<String> list = FileUtils.fileReader("src/case_study/data/Customer.csv");
        List<Customer> customerList = new ArrayList<>();
        String[] arr;
        for (int i = 0 ; i < list.size() ; i ++){
            arr = list.get(i).split(",");
//            if (customerList.get(i).getId() == id){
//                customer =customerList.get(i);
//                break;
//            }

        }
        if (customer != null){
            customerList.remove(customer);
            FileUtils.fileWriter("src/case_study/data/Customer.csv",customerList,true);
        }else


    }
}
