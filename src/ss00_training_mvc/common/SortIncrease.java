package ss00_training_mvc.common;

import ss00_training_mvc.model.Product;

import java.util.Comparator;

public class SortIncrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}