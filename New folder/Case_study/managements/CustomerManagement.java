package Case_study.managements;

import Case_study.libs.CatchAgeExceptionImp;
import Case_study.services.class_service.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);
    public void customerMenu() {
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return menu");
            boolean checkLoop = false;
            int choice = 0;
            while (!checkLoop){
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choice) {
                case 1:
                    new CustomerServiceImpl().display();
                    break;
                case 2:
                    new CustomerServiceImpl().add(new CatchAgeExceptionImp());
                    break;
                case 3:
                    new CustomerServiceImpl().edit(new CatchAgeExceptionImp());
                    break;
                case 4:
                    return;
            }
        }
    }
}
