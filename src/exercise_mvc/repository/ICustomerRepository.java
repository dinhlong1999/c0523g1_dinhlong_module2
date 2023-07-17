package exercise_mvc.repository;

import exercise_mvc.model.Customer;

import java.util.ArrayList;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void addCustomer(Customer customer);
    void delCustomer(int id);
    List<Customer> searchCustomer(String name);
}
