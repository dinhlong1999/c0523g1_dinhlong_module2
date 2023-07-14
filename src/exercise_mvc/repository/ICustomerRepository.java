package exercise_mvc.repository;

import exercise_mvc.Model.Customer;

public interface ICustomerRepository {
    Customer [] findAll();
    void addCustomer(Customer customer);
    void deleteCustomer(int id);
    void searchCustomer(String name);
}
