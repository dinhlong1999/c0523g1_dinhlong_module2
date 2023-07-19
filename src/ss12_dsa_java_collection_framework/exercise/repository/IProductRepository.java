package ss12_dsa_java_collection_framework.exercise.repository;

import ss06_inhrentance.exercise.Point;
import ss12_dsa_java_collection_framework.exercise.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    void add(Product product);
    void repairProduct(int id, Product product);

    void deleteProduct(int id);
    List<Product> getAllProduct();
    List<Product> searchName(String name);
    List<Product> sortPriceIncrease();
    List<Product> sortPrinceDecrease();



}
