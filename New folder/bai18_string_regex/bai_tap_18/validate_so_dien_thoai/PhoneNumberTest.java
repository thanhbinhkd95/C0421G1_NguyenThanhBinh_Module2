package bai18_string_regex.bai_tap_18.validate_so_dien_thoai;

import bai18_string_regex.bai_tap_18.validate_ten_lop_hoc.NameClass;

import java.util.Scanner;

public class PhoneNumberTest {
    public static PhoneNumber phoneNumber;

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.validate("(45)-(0935256851)"));
        System.out.println(phoneNumber.validate("(84)935256851"));
        System.out.println(phoneNumber.validate("(84)-5935256851"));
        System.out.println("Nhập số điện thoại để kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println(number+" hợp lệ? "+ phoneNumber.validate(number));

    }
}
