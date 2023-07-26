package ss00_training_mvc.repository;

import ss00_training_mvc.model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);
    void updateProduct(int id, Product product);
    void delProduct(int id);
    List<Product> showAll();
    List<Product> searchProduct(String name);
    List<Product> sortIncrease();
    List<Product> sortDecrease();
}
