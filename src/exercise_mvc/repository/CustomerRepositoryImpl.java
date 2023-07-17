package exercise_mvc.repository;

import exercise_mvc.model.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {

    public static List<Customer> customerList = new ArrayList<>(10);
    private static int size;


    static {
        customerList.add(new Customer(1, "Long", 24, "VIP"));
        customerList.add(new Customer(2, "Ronaldo", 34, "VIP"));
        customerList.add(new Customer(3, "Messi", 33, "NORMAL"));
        customerList.add(new Customer(4, "Trump", 60, "GOLD"));
        size = customerList.size();

    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);

    }

    @Override
    public void delCustomer(int id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).getId()) {
                customerList.remove(customerList.get(i));
            }
        }
    }
    @Override
    public List<Customer>  searchCustomer(String name) {
      List<Customer> customers = findAll();
      return customers;
    }
}

