package exercise_mvc.controller;

import exercise_mvc.model.Customer;
import exercise_mvc.service.CustomerServiceImpl;
import exercise_mvc.service.ICustomerService;

import java.util.ArrayList;
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
            System.out.println("5. Out ");
            System.out.println("Please input a number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                   service.findAll();
                    break;
                case 2:
                   service.addCustomer();
                    break;
                case 3:

                    service.delCustomer();
                    break;
                case 4:
                   service.searchCustomer();
                    break;
                case 5:
                    System.exit(0);
            }

        }while (true);

    }
}
