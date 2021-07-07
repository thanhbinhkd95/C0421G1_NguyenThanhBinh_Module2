package Case_study.managements;

import Case_study.services.class_service.FacilityServiceImpl;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteFacilityImp;

import java.util.Scanner;

public class FacilityManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void facilityMenu() {
        while (true) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display facility maintenance");
            System.out.println("4. Return menu");
            int choice = 0;
            boolean checkLoop = false;
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
                   new FacilityServiceImpl().display();
                    break;
                case 2:
                    addMenu();
                    break;
                case 3:
                    new FacilityServiceImpl().displayFacMaintain();
                    break;
                case 4:
                    return;
            }
        }
    }

    private void addMenu(){
        while (true) {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            switch (choice) {
                case 1:
                    new FacilityServiceImpl().addVilla(new ReadAndWriteFacilityImp());
                    break;
                case 2:
                    new FacilityServiceImpl().addHouse(new ReadAndWriteFacilityImp());
                    break;
                case 3:
                    new FacilityServiceImpl().addRoom(new ReadAndWriteFacilityImp());
                    break;
                case 4:
                    return;
            }
        }
    }
}
