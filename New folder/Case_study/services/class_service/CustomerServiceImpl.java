package Case_study.services.class_service;

import Case_study.libs.CatchAgeException;
import Case_study.models.Customer;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteCustomerImp;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl {
    private static List<Customer> customers = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    
    public void display() {
        for (Customer element : new ReadAndWriteCustomerImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv")) {
            System.out.println(element.toString());
        }
    }

    
    public void add(CatchAgeException catchAgeException) {
        if (new File("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv").exists()) {
            customers = (List<Customer>) new ReadAndWriteCustomerImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv");
        }
        System.out.println("0. Customer Id");
        String idCustom = scanner.nextLine();
        System.out.println("1. Name customer");
        String nameCustomers = scanner.nextLine();
        System.out.println("2. Birthday");
        String day = scanner.nextLine();
        catchAgeException.checkDateOfBirth(day);
        System.out.println("3. Gender");
        String gender = scanner.nextLine();
        System.out.println("4. Identity Card");
        String idPerson = scanner.nextLine();
        System.out.println("5. Phone Number");
        String number = scanner.nextLine();
        System.out.println("6. Email");
        String email = scanner.nextLine();
        System.out.println("7. Tier of Customer");
        String typeCustomer = scanner.nextLine();
        System.out.println("8. Address");
        String address = scanner.nextLine();
        Customer element = new Customer(idCustom, nameCustomers, day, gender, idPerson, number, email, typeCustomer, address);
        customers.add(element);
        new ReadAndWriteCustomerImp().writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv", customers);
    }

    
    public void edit(CatchAgeException catchAgeException) {
        if (new File("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv").exists()) {
            customers = (List<Customer>) new ReadAndWriteCustomerImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv");
        }
        System.out.println("Nhập id của customer cần edit");
        String idCode = scanner.nextLine();
        boolean checkCustomer = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdCode().equals(idCode)) {
                checkCustomer = true;
                System.out.println("Bạn muốn sửa thông tin nào cho " + customers.get(i).getNamePerson());
                System.out.println("1. Name employee");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Giới tính");
                System.out.println("4. Số Chứng minh nhân dân");
                System.out.println("5. Số điện thoại");
                System.out.println("6. Địa chỉ email");
                System.out.println("7. Loại khách hàng");
                System.out.println("8. Địa chỉ của khách hàng");
                int choice = 0;
                boolean check = false;
                while (!check) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        check = true;
                    } catch (NumberFormatException ex) {
                        System.err.println("Nhập đúng định dạng số");
                    }
                }
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên muốn sửa");
                        String name = scanner.nextLine();
                        customers.get(i).setNamePerson(name);
                        break;
                    case 2:
                        System.out.println("Nhập dateOfBirth");
                        String day = scanner.nextLine();
                        catchAgeException.checkDateOfBirth(day);
                        customers.get(i).setDateOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        String gender = scanner.nextLine();
                        customers.get(i).setDateOfBirth(gender);
                        break;
                    case 4:
                        System.out.println("Nhập CMND");
                        String idPerson = scanner.nextLine();
                        customers.get(i).setIdPerson(idPerson);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại");
                        String number = scanner.nextLine();
                        customers.get(i).setPhoneNumber(number);
                        break;
                    case 6:
                        System.out.println("Nhập emailAddress");
                        String email = scanner.nextLine();
                        customers.get(i).setEmailAddress(email);
                        break;
                    case 7:
                        System.out.println("Nhập loại khách hàng");
                        String typeCustomer = scanner.nextLine();
                        customers.get(i).setTypeCustomer(typeCustomer);
                        break;
                    case 8:
                        System.out.println("Nhập địa chỉ của khách hàng");
                        String address = scanner.nextLine();
                        customers.get(i).setAddress(address);
                        break;
                }
            }
        }
        if (checkCustomer) {
            System.out.println("Hoàn thành việc cập nhật");
            new ReadAndWriteCustomerImp().writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv", customers);
        } else {
            System.out.println("Không có id này trong list Employees");
        }
    }

    //Sử dụng getList để lấy danh sách customer phục vụ việc booking
    
    public List<Customer> getList() {
        return (List<Customer>) new ReadAndWriteCustomerImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv");
    }
}
