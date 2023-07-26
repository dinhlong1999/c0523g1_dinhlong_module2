package ss00_training_mvc.repository;

import ss00_training_mvc.common.SortDecrease;
import ss00_training_mvc.common.SortIncrease;
import ss00_training_mvc.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {

    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Xiaomi", 10000000));
        productList.add(new Product(2, "Iphone", 30000000));
        productList.add(new Product(3, "Samsung",20000000));
        productList.add(new Product(4, "Oppo",   15000000));
    }


    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(int id, Product product ) {
        for (Product product1: productList) {
            if (id == product1.getId()){
                product1.setId(product.getId());
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                break;
            }
        }
    }

    @Override
    public void delProduct(int id) {
        productList.remove(id);
    }

    @Override
    public List<Product> showAll() {
        return productList;
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                products.add(product);
                break;
            }

        }
        return products;
    }

    @Override
    public List<Product> sortIncrease() {
        SortIncrease sortIncrease = new SortIncrease();
        Collections.sort(productList,sortIncrease);
        return productList;
    }

    @Override
    public List<Product> sortDecrease() {
        SortDecrease sortDecrease = new SortDecrease();
        Collections.sort(productList,sortDecrease);
        return productList;
    }
}



