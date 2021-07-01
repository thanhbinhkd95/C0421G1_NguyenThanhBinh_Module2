package bai17_io_binary_file_serialization.bai_tap_17.quan_ly_san_pham_ra_file_nhi_phan;

import bai17_io_binary_file_serialization.thuc_hanh_17.read_write_binary.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        System.out.println("Chọn chức năng: " +
                "\n1. Thêm sản phẩm " +
                "\n2. Tìm kiếm sản phẩm trong file" +
                "\n3. Hiển thị sản phẩm trong file"+
                "\n4. Thoát chương trình ");
        boolean checkLoop = true;
        while (checkLoop){
        Scanner scanner = new Scanner(System.in);
        int chucNang = scanner.nextInt();
        switch (chucNang) {
            case 1:
                productManager.add();
                productManager.display();
                break;
            case 2:
                productManager.searchProduct();
                break;
            case 3:
                System.out.println("Hiển thị danh sách sản phẩm từ file: ");
                List<Product> productList = ProductManager.readDataFromFile("product.txt");
                for (Product product : productList){
                    System.out.println(product);
                }
                break;
            case 4:
                checkLoop =false;
                break;
            default:
                System.out.println("Nhập lại");
        }
        }
    }
}
