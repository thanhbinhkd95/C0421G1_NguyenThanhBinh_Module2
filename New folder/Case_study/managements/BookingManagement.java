package Case_study.managements;

import Case_study.services.class_service.BookingServiceImpl;
import Case_study.services.class_service.ContactServiceImpl;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteBookingImp;
import Case_study.utils.class_ReadAndWrite.ReadAndWriteContractImp;

import java.util.Scanner;


public class BookingManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void bookingMenu() {
        while (true) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            boolean checkLoop = false;
            int choiceSecond = 0;
            while (!checkLoop){
                try {
                    choiceSecond = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choiceSecond) {
                case 1:
                    new BookingServiceImpl().addBooking(new ReadAndWriteBookingImp());
                    break;
                case 2:
                    new BookingServiceImpl().displayListBooking(new ReadAndWriteBookingImp());
                    break;
                case 3:
                    new ContactServiceImpl().creatNewContract(new ReadAndWriteContractImp());
                    break;
                case 4:
                    new ContactServiceImpl().displayListContract(new ReadAndWriteContractImp());
                    break;
                case 5:
                    new ContactServiceImpl().editContract(new ReadAndWriteContractImp());
                    break;
                case 6:
                    return;
            }
        }
    }
}
