package ss17_binary_file.exercise.exercise1.repository;

import ss16_file.practice.ReadAndWriteFile;
import ss17_binary_file.exercise.exercise1.model.Product;
import ss17_binary_file.exercise.exercise1.util.ReadAnhWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FILE_PATH = "D:\\c0523g1_dinhlong_module2\\src\\ss17_binary_file\\exercise\\exercise1\\data\\Product.csv";


    @Override
    public void add(Product product) {
        List<String> srtingList = new ArrayList<>();
        srtingList.add(product.getInformation());
        ReadAnhWrite.writeFile(FILE_PATH, srtingList, true);
    }

    @Override
    public List<Product> showAll() {
        List<Product> products = new ArrayList<>();
        List<String> stringList = ReadAnhWrite.readFie(FILE_PATH);
        String[] array;
        Product product;
        for (String s : stringList) {
            array = s.split(",");
            product = new Product(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], array[4]);
            products.add(product);
        }
        return products;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = showAll();
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                productList.add(product);
                break;
            }
        }
        return productList;
    }

    @Override
    public void delete(int id) {
        List<Product> products = this.showAll();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                products.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product product : products) {
            stringList.add(product.getInformation());
        }
        ReadAnhWrite.writeFile(FILE_PATH,stringList,false);
    }


    @Override
    public List<Product> sortPrice() {
        List<Product> products = this.showAll();
        Collections.sort(products);
        return products;
    }

}