package bai12_java_collection_framework.bai_tap_12.luyen_tap_arraylist_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManager<T> {
    private List<Product> productList = new LinkedList<>();
    public String add(Product e) {
        for(int i =0;i<productList.size();i++){
            if(productList.get(i).getId()==e.getId()){
                return "id "+e.getId()+" đã tồn tại";
            }
        }
        productList.add(e);
        return "thêm thành công product: " + e;
    }
    public void editName(int id, String newName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.get(i).setName(newName);
//                productList.get(i).toString();
                return;
            }
        }
    }
    public void editPrice(int id, int newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setPrice(newPrice);
//                product.toString();
                return;
            }
        }
    }

    public String remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                return "Xóa thành công id " + id;
            }
        }
        return "Không tìm thấy id " + id;
    }

    public void display() {
        for (Product a : productList) {
            System.out.println(a);
        }
    }
    public String searchId(int id) {
        for (Product product : productList) {
            if (product.getId()== id) {
                return product.toString();
            }
        }
        return "Không tìm thấy id "+id;
    }
    public String searchName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return "Đã tìm thấy: " + product.toString();
            }
        }
        return "Không tìm thấy tên "+ name;
    }

    public void sortByPriceIncrease() {
        Collections.sort(productList, new PriceComparatorIncrease());
    }

    public void sortByPriceDecrease() {
        Collections.sort(productList, new PriceComparatorDecrease());
    }


}
