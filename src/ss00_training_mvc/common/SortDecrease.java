package ss00_training_mvc.common;

import ss00_training_mvc.model.Product;

import java.util.Comparator;

public class SortDecrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
