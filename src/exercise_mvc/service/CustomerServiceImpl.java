package exercise_mvc.service;

import exercise_mvc.Model.Customer;
import exercise_mvc.repository.CustomerRepositoryImpl;
import exercise_mvc.repository.ICustomerRepository;

public class CustomerServiceImpl implements  ICustomerService{
    private ICustomerRepository repository = new CustomerRepositoryImpl();
    @Override
    public Customer[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    @Override
    public void delCustomer(int id) {
        repository.deleteCustomer(id);

    }

    @Override
    public void searchCustomer(String name) {
        repository.searchCustomer(name);
    }
}
