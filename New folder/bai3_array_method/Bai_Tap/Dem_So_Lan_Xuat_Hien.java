package bai3_array_method.Bai_Tap;

import java.util.Scanner;

public class Dem_So_Lan_Xuat_Hien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  /*// Tạo lớp Scanner để nhập xuất dữ liệu*/
        System.out.println("Nhập chuỗi");
        String str = input.nextLine();               /*Đẩy dữ liệu nhập vào chuỗi str*/
        System.out.println("Chuỗi vừa nhập: " + str);
        Scanner inputChar = new Scanner(System.in);   /*Tạo lớp Scanner nhập dữ liệu từ InputChar*/
        System.out.println("Nhập vào kí tự: ");
        char myChar= inputChar.next().charAt(0);     /*Đẩy dữ liệu từ inputchar vào myChar, lấy dữ liệu từ phần tử thứ 0, in ra dữ liệu trước khoảng trắng*/
        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==myChar){
                count++;
            }
        }
        System.out.println("Ký tự " + myChar+ " xuất hiện "+ count+" lần");
    }
}
