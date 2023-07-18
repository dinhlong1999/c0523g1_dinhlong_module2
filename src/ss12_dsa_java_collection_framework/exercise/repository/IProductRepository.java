package ss12_dsa_java_collection_framework.exercise.repository;

import ss06_inhrentance.exercise.Point;
import ss12_dsa_java_collection_framework.exercise.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    void add(Product product);
    void repairProduct(int id, Product product);

    void deleteProduct(int id);
    ArrayList<Product> getAllProduct();
    ArrayList<Product> searchName(String name);
    ArrayList<Product> sortPriceIncrease();
    ArrayList<Product> sortPrinceDecrease();



}
