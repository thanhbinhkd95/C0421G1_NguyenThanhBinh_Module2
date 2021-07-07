package Case_study.managements;

import Case_study.services.class_service.PromotionServiceImpl;

import java.util.Scanner;

public class PromotionManagement {
    private static Scanner scanner = new Scanner(System.in);
    public void promotionMenu() {
        while (true) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return menu");
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
                    new PromotionServiceImpl().display();
                    break;
                case 2:
                    new PromotionServiceImpl().listGetVoucher();
                    break;
                case 3:
                    return;
            }
        }
    }
}
