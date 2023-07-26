package ss17_binary_file.exercise.exercise1.repository;

import ss17_binary_file.exercise.exercise1.model.Product;

import java.util.List;

public interface IProductRepository {
    void add(Product product);
    List<Product> showAll();
    List<Product> search(String name);
    void delete(int id);
    List<Product> sortPrice();

}
