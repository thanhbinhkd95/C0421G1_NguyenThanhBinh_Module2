package Case_study.services.class_service;

import Case_study.libs.CatchAgeException;
import Case_study.models.Employee;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteEmployeeImp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl {

    private static List<Employee> employees = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public void display() {
        for (Employee element : new ReadAndWriteEmployeeImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\employees.csv")) {
            System.out.println(element.toString());
        }
    }

    public void add(CatchAgeException catchAgeException) {
        if (new File("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\employees.csv").exists()) {
            employees = (List<Employee>) new ReadAndWriteEmployeeImp().readFile("src\\Case_study\\data\\employees.csv");
        }
        System.out.println("0. Mã số của nhân viên");
        String idEmploy = scanner.nextLine();
        System.out.println("1. Name employee");
        String name = scanner.nextLine();
        System.out.println("2. Ngày sinh");
        String day = scanner.nextLine();
        catchAgeException.checkDateOfBirth(day);
        System.out.println("3. Giới tính");
        String sex = scanner.nextLine();
        System.out.println("4. Số Chứng minh nhân dân");
        String idPerson = scanner.nextLine();
        System.out.println("5. Số điện thoại");
        String number = scanner.nextLine();
        System.out.println("6. Địa chỉ email");
        String email = scanner.nextLine();
        System.out.println("7. Trình độ");
        String level = scanner.nextLine();
        System.out.println("8. Vị trí");
        String position = scanner.nextLine();
        System.out.println("9. Salary");
        boolean checkSalary = true;
        int salary = 0;
        while (checkSalary) {
            try {
                salary = Integer.parseInt(scanner.nextLine());
                checkSalary = false;
            } catch (RuntimeException ex) {
                System.out.println("Nhập số vào: ");
            }
        }
        Employee element = new Employee(idEmploy , name , day , sex , idPerson , number , email , level , position , salary);
        employees.add(element);
        new ReadAndWriteEmployeeImp().writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\employees.csv" , employees);
    }


    public void edit(CatchAgeException catchAgeException) {
        if (new File("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\employees.csv").exists()) {
            employees = (List<Employee>) new ReadAndWriteEmployeeImp().readFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\employees.csv");
        }
        System.out.println("Nhập id employee muốn tìm kiếm");
        String idCode = scanner.nextLine();
        boolean checkEmploye = false;
        for (Employee employee : employees) {
            if (employee.getIdCode().equals(idCode)) {
                checkEmploye = true;
                System.out.println("Bạn muốn sửa thông tin nào cho" + employee.getNamePerson());
                System.out.println("1. Name employee");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Giới tính");
                System.out.println("4. Số Chứng minh nhân dân");
                System.out.println("5. Số điện thoại");
                System.out.println("6. Địa chỉ email");
                System.out.println("7. Trình độ");
                System.out.println("8. Vị trí");
                System.out.println("9. Salary");
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
                        employee.setNamePerson(name);
                        break;
                    case 2:
                        System.out.println("Nhập dateOfBirth");
                        String day = scanner.nextLine();
                        catchAgeException.checkDateOfBirth(day);
                        employee.setDateOfBirth(day);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        String sex = scanner.nextLine();
                        employee.setDateOfBirth(sex);
                        break;
                    case 4:
                        System.out.println("Nhập CMND");
                        String idPerson = scanner.nextLine();
                        employee.setIdPerson(idPerson);
                        break;
                    case 5:
                        System.out.println("Nhập số điện thoại");
                        String number = scanner.nextLine();
                        employee.setPhoneNumber(number);
                        break;
                    case 6:
                        System.out.println("Nhập emailAddress");
                        String email = scanner.nextLine();
                        employee.setEmailAddress(email);
                        break;
                    case 7:
                        System.out.println("Nhập trình độ");
                        String level = scanner.nextLine();
                        employee.setLevel(level);
                        break;
                    case 8:
                        System.out.println("Nhập position");
                        String position = scanner.nextLine();
                        employee.setPosition(position);
                        break;
                    case 9:
                        System.out.println("Nhập lương");
                        boolean checkSalary = true;
                        int salary = 0;
                        while (checkSalary) {
                            try {
                                salary = Integer.parseInt(scanner.nextLine());
                                checkSalary = false;
                            } catch (RuntimeException ex) {
                                System.out.println("Nhập số vào: ");
                            }
                        }
                        employee.setSalary(salary);
                        break;
                }
                break;
            }
        }
        if (checkEmploye) {
            System.out.println("Hoàn thành việc cập nhật");
            new ReadAndWriteEmployeeImp().writeFile("F:\\C0421G1_NguyenThanhBinh_Module2\\New folder\\Case_study\\data\\employees.csv" , employees);
        } else {
            System.out.println("Không có id này trong list Employees");
        }

    }

}
