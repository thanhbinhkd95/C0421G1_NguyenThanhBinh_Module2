package bai17_io_binary_file_serialization.bai_tap_17.quan_ly_san_pham_ra_file_nhi_phan;

import bai17_io_binary_file_serialization.thuc_hanh_17.read_write_binary.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Serializable {
    List<Product> productList = new ArrayList<>();
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.writeBytes("\n");
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void add() {
   while (true){
       try {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Nhập id sản phẩm: ");
           int id = Integer.parseInt(scanner.nextLine());
           if(ProductManager.searchId(id)){
               throw new IdExistException("id đã tồn tại, nhập lại");
           }
           System.out.print("Nhập tên sản phẩm: ");
           String name = scanner.nextLine();
           System.out.print("Nhập tên nhà sản xuất: ");
           String manufacture = scanner.nextLine();
           System.out.print("Nhập giá sản phẩm: ");
           double price = Double.parseDouble(scanner.nextLine());
           System.out.print("Nhập khối lượng (gram): ");
           double weight = Double.parseDouble(scanner.nextLine());
           Product product = new Product(id, name, manufacture, price, weight);
           productList.add(product);
           writeToFile("product.txt",productList);
           break;
       }
       catch (NumberFormatException e){
           System.out.println("Nhập sai rồi, nhập lại từ đầu");
       }
       catch (IdExistException e){
           System.out.println(e.getMessage());
       }
   }
    }
    public void display(){
        for(Product a : productList){
            System.out.println(a.toString());
        }
    }
    public void searchProduct(){
        List<Product> products = new ArrayList<>();
        try {
         System.out.print("Nhập tên sản phẩm cần tìm: ");
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         FileInputStream fileInputStream = new FileInputStream("product.txt");
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
         products = (List<Product>) objectInputStream.readObject();
         objectInputStream.close();
         fileInputStream.close();
         for(Product a:products){
             if(a.getNameProduct().equals(name)){
                 System.out.println(a.toString());
                 return;
             }
         }
         System.out.println("Không tìm thấy");
     }catch (IOException | ClassNotFoundException e){
         System.out.println("Lỗi rồi");
     }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return products;
    }
    public static boolean searchId(int id){
        List<Product> productList = ProductManager.readDataFromFile("product.txt");
        for(Product a: productList){
            if(a.getIdProduct()==id){
                return true;
            }
        }
        return false;
    }

}
