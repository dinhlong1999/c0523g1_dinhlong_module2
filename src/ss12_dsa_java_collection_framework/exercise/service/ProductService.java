package ss12_dsa_java_collection_framework.exercise.service;

import ss12_dsa_java_collection_framework.exercise.model.Product;
import ss12_dsa_java_collection_framework.exercise.repository.IProductRepository;
import ss12_dsa_java_collection_framework.exercise.repository.ProductRepository;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class ProductService implements IProduceService {

     private IProductRepository repository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Input a id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input a name: ");
        String name = scanner.nextLine();
        System.out.println("Input a price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        repository.add(product);
    }

    @Override
    public void repairProduct() {
        System.out.println("Input ID you want repair: ");
        int idRepair = Integer.parseInt(scanner.nextLine());
        System.out.println("Input a ID new: ");
        int idNew = Integer.parseInt(scanner.nextLine());
        System.out.println("Input a name new: ");
        String nameNew = scanner.nextLine();
        System.out.println("Input a price new: ");
        int priceNew = Integer.parseInt(scanner.nextLine());
        Product product1 = new Product(idNew, nameNew, priceNew);
        repository.repairProduct(idRepair, product1);


    }

    @Override
    public void deleteProduct() {
        System.out.println("Input id you want delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        repository.deleteProduct(id);
        System.out.println("Success");
    }

    @Override
    public void getAllProduct() {
        List<Product> products = repository.getAllProduct();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void searchName() {
        System.out.println("Enter a name want search:");
        String nameSearch = scanner.nextLine();
        List<Product> productSearch = repository.searchName(nameSearch);
        for (Product product: productSearch) {
            System.out.println("Name you searching: " + product);
            }
        }

    @Override
    public void sortPrinceIncrease() {
        List<Product> products = repository.sortPriceIncrease();
        for (Product product: products) {
            System.out.println(product);
        }
    }

    @Override
    public void sortPrinceDecrease() {
        List<Product> products = repository.sortPrinceDecrease();
        for (Product product: products) {
            System.out.println(product);
        }
    }


}
