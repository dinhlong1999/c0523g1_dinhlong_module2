package ss17_binary_file.exercise.exercise1.service;

import ss17_binary_file.exercise.exercise1.model.Product;
import ss17_binary_file.exercise.exercise1.repository.IProductRepository;
import ss17_binary_file.exercise.exercise1.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository repository = new ProductRepository();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter brand");
        String brand = scanner.nextLine();
        System.out.println("Enter describe");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, brand, describe);
        repository.add(product);
    }

    @Override
    public void showAll() {
        List<Product> productList = repository.showAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  name to search: ");
        String nameSearch = scanner.nextLine();
        List<Product> products = repository.search(nameSearch);
        for (Product product : products) {
            System.out.println(product);
            break;
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID to delete:");
        int idDelete = scanner.nextInt();
        repository.delete(idDelete);
        System.out.println("Success");
    }

    @Override
    public void sortPrice() {
        List<Product> productList = repository.sortPrice();
        for (Product product: productList) {
            System.out.println(product);
        }
    }
}
