package ss00_training_mvc.controller;

import exercise_mvc.service.ICustomerService;
import ss00_training_mvc.repository.IProductRepository;
import ss00_training_mvc.service.IProductService;
import ss00_training_mvc.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void showMenu()
    {
        IProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----------Menu-------------");
            System.out.println("1. List product:");
            System.out.println("2. Update product:");
            System.out.println("3. Delete Product:");
            System.out.println("4. Search Product:");
            System.out.println("5. Add Product:");
            System.out.println("6. Sort increase Product:");
            System.out.println("7. Sort decrease Product:");
            System.out.println("8. Out process");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    service.showAll();
                    break;
                case 2:
                    service.updateProduct();
                    break;
                case 3:
                    service.deleteProduct();
                    break;
                case 4:
                    service.searchProduct();
                    break;
                case 5:
                    service.addProduct();
                    break;
                case 6:
                    service.sortIncrease();
                    break;
                case 7:
                    service.sortDecrease();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }


}
