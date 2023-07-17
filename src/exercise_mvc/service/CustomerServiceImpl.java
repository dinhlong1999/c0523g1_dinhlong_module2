package exercise_mvc.service;

import exercise_mvc.model.Customer;
import exercise_mvc.repository.CustomerRepositoryImpl;
import exercise_mvc.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements  ICustomerService{
    private ICustomerRepository repository = new CustomerRepositoryImpl();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void findAll() {
        for (Customer customer: repository.findAll()) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {

        System.out.println("enter id");
        int enterId = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        System.out.println("enter age");
        int enterAge = Integer.parseInt(scanner.nextLine());
        System.out.println("enter type");
        String enterType = scanner.nextLine();
        Customer customer1 = new Customer(enterId, enterName, enterAge, enterType);
        repository.addCustomer(customer1);
    }

    @Override
    public void delCustomer() {
        System.out.println("Input id you want delete");
        int id = Integer.parseInt(scanner.nextLine());
        repository.delCustomer(id);


    }

    @Override
    public void searchCustomer() {
        System.out.println("Enter a name you want search");
        String name = scanner.nextLine();
        boolean flag = false;
        List<Customer> customerSearch = repository.findAll();
        for (int i = 0; i < customerSearch.size(); i++) {
            if (customerSearch.get(i).getName().contains(name)) ;
            {
                System.out.println("Name of customer: " + customerSearch.get(i).getName());
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("No found");
        }
    }
}
