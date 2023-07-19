package ss12_dsa_java_collection_framework.exercise.repository;

import ss12_dsa_java_collection_framework.exercise.compare.CompareDecrease;
import ss12_dsa_java_collection_framework.exercise.compare.CompareIncrease;
import ss12_dsa_java_collection_framework.exercise.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {

    public static List<Product> listOfProduct = new ArrayList<>();

    static {

        listOfProduct.add(new Product(1, "IPHONE 14 ", 30000000));
        listOfProduct.add(new Product(2, "IPHONE 12 ", 15000000));
        listOfProduct.add(new Product(3, "IPHONE 13 ", 20000000));
        listOfProduct.add(new Product(4, "IPHONE 15 ", 35000000));

    }

    @Override
    public void add(Product product) {
        listOfProduct.add(product);
    }

    @Override
    public void repairProduct(int id, Product product) {
        for (Product products : listOfProduct) {
            if (products.getId() == id) {
                products.setId(product.getId());
                products.setName(product.getName());
                products.setPrice(product.getPrice());
                break;
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < listOfProduct.size(); i++) {
            if (id == listOfProduct.get(i).getId()) {
                listOfProduct.remove(i);
                break;
            }
        }
    }

    @Override
    public List <Product> getAllProduct() {
        return listOfProduct;
    }

    @Override
    public List<Product> searchName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : listOfProduct) {
            if (product.getName().contains(name)) {
                products.add(product);
                break;
            }
        }
        return products;

    }

    @Override
    public List<Product> sortPriceIncrease() {
        CompareIncrease compareIncrease = new CompareIncrease();
        Collections.sort(listOfProduct, compareIncrease);
        return listOfProduct;
    }

    @Override
    public List<Product> sortPrinceDecrease() {
        CompareDecrease compareDecrease = new CompareDecrease();
        Collections.sort(listOfProduct, compareDecrease);
        return listOfProduct;
    }
}

