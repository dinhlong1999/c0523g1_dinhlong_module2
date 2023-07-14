package exercise_mvc.service;

import exercise_mvc.Model.Customer;

public interface ICustomerService {
    Customer [] findAll();
    void addCustomer(Customer customer);
    void delCustomer(int id);
    void searchCustomer(String name);
}
