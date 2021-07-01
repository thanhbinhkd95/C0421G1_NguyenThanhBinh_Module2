package bai17_io_binary_file_serialization.bai_tap_17.quan_ly_san_pham_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String nameOfManufacturer;
    private double price;
    private double weight;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String nameOfManufacturer, double price, double weight) throws IdExistException {
            this.idProduct = idProduct;
            this.nameProduct = nameProduct;
            this.nameOfManufacturer = nameOfManufacturer;
            this.price = price;
            this.weight = weight;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", price=" + price + " VND"+
                ", weight=" + weight +" gram"+
                '}';
    }
}
