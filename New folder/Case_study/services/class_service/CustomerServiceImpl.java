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
        System.out.println("Nh???p id c???a customer c???n edit");
        String idCode = scanner.nextLine();
        boolean checkCustomer = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdCode().equals(idCode)) {
                checkCustomer = true;
                System.out.println("B???n mu???n s???a th??ng tin n??o cho " + customers.get(i).getNamePerson());
                System.out.println("1. Name employee");
                System.out.println("2. Ng??y sinh");
                System.out.println("3. Gi???i t??nh");
                System.out.println("4. S??? Ch???ng minh nh??n d??n");
                System.out.println("5. S??? ??i???n tho???i");
                System.out.println("6. ?????a ch??? email");
                System.out.println("7. Lo???i kh??ch h??ng");
                System.out.println("8. ?????a ch??? c???a kh??ch h??ng");
                int choice = 0;
                boolean check = false;
                while (!check) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        check = true;
                    } catch (NumberFormatException ex) {
                        System.err.println("Nh???p ????ng ?????nh d???ng s???");
                    }
                }
                switch (choice) {
                    case 1:
                        System.out.println("Nh???p t??n mu???n s???a");
                        String name = scanner.nextLine();
                        customers.get(i).setNamePerson(name);
                        break;
                    case 2:
                        System.out.println("Nh???p dateOfBirth");
                        String day = scanner.nextLine();
                        catchAgeException.checkDateOfBirth(day);
                        customers.get(i).setDateOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nh???p gi???i t??nh");
                        String gender = scanner.nextLine();
                        customers.get(i).setDateOfBirth(gender);
                        break;
                    case 4:
                        System.out.println("Nh???p CMND");
                        String idPerson = scanner.nextLine();
                        customers.get(i).setIdPerson(idPerson);
                        break;
                    case 5:
                        System.out.println("Nh???p s??? ??i???n tho???i");
                        String number = scanner.nextLine();
                        customers.get(i).setPhoneNumber(number);
                        break;
                    case 6:
                        System.out.println("Nh???p emailAddress");
                        String email = scanner.nextLine();
                        customers.get(i).setEmailAddress(email);
                        break;
                    case 7:
                        System.out.println("Nh???p lo???i kh??ch h??ng");
                        String typeCustomer = scanner.nextLine();
                        customers.get(i).setTypeCustomer(typeCustomer);
                        break;
                    case 8:
                        System.out.println("Nh???p ?????a ch??? c???a kh??ch h??ng");
                        String address = scanner.nextLine();
                        customers.get(i).setAddress(address);
                        break;
                }
            }
        }
        if (checkCustomer) {
            System.out.println("Ho??n th??nh vi???c c???p nh???t");
            new ReadAndWriteCustomerImp().writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv", customers);
        } else {
            System.out.println("Kh??ng c?? id n??y trong list Employees");
        }
    }

    //S??? d???ng getList ????? l???y danh s??ch customer ph???c v??? vi???c booking
    
    public List<Customer> getList() {
        return (List<Customer>) new ReadAndWriteCustomerImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\customer.csv");
    }
}
