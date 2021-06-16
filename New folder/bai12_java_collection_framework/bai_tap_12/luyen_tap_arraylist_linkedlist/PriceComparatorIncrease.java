package bai12_java_collection_framework.bai_tap_12.luyen_tap_arraylist_linkedlist;

import java.util.Comparator;

public class PriceComparatorIncrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
