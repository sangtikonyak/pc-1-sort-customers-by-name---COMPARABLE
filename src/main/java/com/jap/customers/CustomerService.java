package com.jap.customers;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerService {
    // This method will return the names of the customers in sorted alphabetical order.
public List<String> getListOfCustomersSortedByName(List<Customer> customerList){
     List<String> stringList=new ArrayList<>();

    Collections.sort(customerList);
    for (Customer customer : customerList) {
        stringList.add(customer.getCustomerName());
    }
    System.out.println("stringList = " + stringList);
    return stringList;
}

    public static void main(String[] args) {
        CustomerService c=new CustomerService();
        List<Customer> list=Arrays.asList(new Customer(11,"Sangti","Male",true,"Mon"),
                new Customer(11,"Khenou","Male",true,"Mon"),
                new Customer(11,"Angjei","Male",true,"Mon"),
                new Customer(11,"Jaitok","Male",true,"Mon"),
                new Customer(11,"Nahfo","Male",true,"Mon"));
        c.getListOfCustomersSortedByName(list);
    }

}
