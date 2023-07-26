package ss00_training_mvc.service;

import ss00_training_mvc.model.Product;
import ss00_training_mvc.repository.IProductRepository;
import ss00_training_mvc.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository repository = new ProductRepository();

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a id new: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a  name new: ");
        String name = scanner.nextLine();
        System.out.println("Enter a price new:");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        repository.addProduct(product);
    }

    @Override
    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a id you want update");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a id new:");
        int idNew = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a name new: ");
        String nameNew = scanner.nextLine();
        System.out.println("Enter a price new: ");
        int priceNew = Integer.parseInt(scanner.nextLine());
        Product product = new Product(idNew, nameNew, priceNew);
        repository.updateProduct(idUpdate, product);
    }

    @Override
    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a id you want delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        repository.delProduct(idDelete);
    }

    @Override
    public void showAll() {
        List<Product> productList = repository.showAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name want search");
        String name = scanner.nextLine();
        List<Product> products =repository.searchProduct(name);
        for (Product product: products) {
            System.out.println("Name of product: " + product);

        }
    }

    @Override
    public void sortIncrease() {
        List<Product> products = repository.sortIncrease();
        for (Product product : products){
            System.out.println(product);
        }

    }

    @Override
    public void sortDecrease() {
        List<Product> products = repository.sortDecrease();
        for (Product product: products) {
            System.out.println(product);

        }
    }
}
