package ss12_dsa_java_collection_framework.exercise.controller;

import exercise_mvc.service.ICustomerService;
import ss12_dsa_java_collection_framework.exercise.service.IProduceService;
import ss12_dsa_java_collection_framework.exercise.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void showMenu(){
        IProduceService service = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
            do {
                System.out.println("Please choose number: ");
                System.out.println("1.List product: ");
                System.out.println("2.Add new product:  ");
                System.out.println("3.Repair product: ");
                System.out.println("4.Delete product: ");
                System.out.println("5.Search product: ");
                System.out.println("6.Sort price INCREASE: ");
                System.out.println("7.Sort price DECREASE: ");
                System.out.println("8.Exit: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        service.getAllProduct();
                        break;
                    case 2:
                        service.addProduct();
                        break;
                    case 3:
                        service.repairProduct();
                        break;
                    case 4:
                        service.deleteProduct();
                        break;
                    case 5:
                        service.searchName();
                        break;
                    case 6:
                        service.sortPrinceIncrease();
                        break;
                    case 7:
                        service.sortPrinceDecrease();
                        break;
                    case 8:
                        System.exit(0);
                }
        }while (true);
    }
}
