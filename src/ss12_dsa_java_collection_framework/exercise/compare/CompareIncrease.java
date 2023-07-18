package ss12_dsa_java_collection_framework.exercise.compare;

import ss12_dsa_java_collection_framework.exercise.model.Product;

import java.util.Comparator;

public class CompareIncrease implements Comparator<Product> {




    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
