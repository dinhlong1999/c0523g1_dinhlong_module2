package ss17_binary_file.exercise.exercise1.controller;

import exercise_mvc.service.ICustomerService;
import ss17_binary_file.exercise.exercise1.service.IProductService;
import ss17_binary_file.exercise.exercise1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void showMenu(){
        IProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            try {
                System.out.println("-----Menu-----");
                System.out.println("1.List");
                System.out.println("2.Add product: ");
                System.out.println("3.Search product: ");
                System.out.println("4.Delete product: ");
                System.out.println("5.SortPrice: ");
                System.out.println("6.Exit");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        service.showAll();
                        break;
                    case 2:
                        service.add();
                        break;
                    case 3:
                        service.search();
                        break;
                    case 4:
                        service.delete();
                        break;
                    case 5:
                        service.sortPrice();
                        break;
                    case 6:
                        System.exit(0);
                }
            }catch (NumberFormatException e){
                System.out.println("Enter number key");
            }
        }while (true);
    }

}
