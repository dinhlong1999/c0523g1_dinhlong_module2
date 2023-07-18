package ss12_dsa_java_collection_framework.exercise.compare;

import ss12_dsa_java_collection_framework.exercise.model.Product;

import java.util.Comparator;

public class CompareDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() -o1.getPrice();
    }
}
