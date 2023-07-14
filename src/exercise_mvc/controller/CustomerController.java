package exercise_mvc.controller;

import exercise_mvc.Model.Customer;
import exercise_mvc.service.CustomerServiceImpl;
import exercise_mvc.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService service = new CustomerServiceImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select =0;
        do {
            System.out.println("------Customer Manager------");
            System.out.println("1. List: ");
            System.out.println("2. Create: ");
            System.out.println("3. Delete: ");
            System.out.println("4. Search: ");
            System.out.println("Please input a number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    Customer[] customerList = service.findAll();
                    for (Customer customer : customerList){
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.println("Please input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input name: ");
                    String name = scanner.nextLine();
                    System.out.println("Please input age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input type customer: ");
                    String type = scanner.nextLine();
                    Customer customer = new Customer(id,name,age,type);
                    service.addCustomer(customer);
                    break;
                case 3:
                    System.out.println("Please input id: ");
                    int numberDel = Integer.parseInt(scanner.nextLine());
                    service.delCustomer(numberDel);
                    break;
            }
        }while (true);

    }
}
