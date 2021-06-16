package bai1_introduction_java.bai_tap_1;

import java.util.Scanner;

public class bai_tap_4 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Read into word: ");
        if (number < 10 && number >= 0) {
            read0To9(number);
        }
        else if (number < 20 && number >= 10) {
            read10To19(number);
        }
        else if (number < 100 && number >= 20) {
            int y = number%10;
            if (y != 0) {
                int x = number - y;
                readTens(x);
                System.out.print(' ');
                read0To9(y);
            }
            else {
                readTens(number);
            }
        }
        else if (number < 1000 && number >= 100) {
            int a = number%100;
            if (a > 19) {
                int b = a%10;
                if (b != 0) {
                    read0To9(number/100);
                    System.out.print(' ');
                    System.out.print("hundred");
                    System.out.print(' ');
                    readTens(a-b);
                    System.out.print(' ');
                    read0To9(b);
                }
                else {
                    read0To9(number/100);
                    System.out.print(' ');
                    System.out.print("hundred");
                    System.out.print(' ');
                    readTens(a-b);
                }
            }
            else if ( a >= 10 ) {
                read0To9(number / 100);
                System.out.print(' ');
                System.out.print("hundred");
                System.out.print(' ');
                read10To19(a);
            }
            else if ( a > 0 ) {
                read0To9(number/100);
                System.out.print(' ');
                System.out.print("hundred");
                System.out.print(' ');
                read0To9(a);
            }
            else {
                read0To9(number/100);
                System.out.print(' ');
                System.out.print("hundred");
            }
        }
        else {
            System.out.print("Number is out of range");
        }
    }

    static void read0To9 (int number) {
        String readResult;
        switch (number) {
            case  0:
                readResult = "Zero";
                break;
            case  1:
                readResult = "One";
                break;
            case  2:
                readResult = "Two";
                break;
            case  3:
                readResult = "Three";
                break;
            case  4:
                readResult = "Four";
                break;
            case  5:
                readResult = "Five";
                break;
            case  6:
                readResult = "Six";
                break;
            case  7:
                readResult = "Seven";
                break;
            case  8:
                readResult = "Eight";
                break;
            case  9:
                readResult = "Nine";
                break;
            default:
                readResult = "";
                break;
        }
        System.out.print(readResult);
    }

    static void read10To19 (int number) {
        String readResult;
        switch (number) {
            case  10:
                readResult = "Ten";
                break;
            case  11:
                readResult = "Eleven";
                break;
            case  12:
                readResult = "Twelve";
                break;
            case  13:
                readResult = "Thirteen";
                break;
            case  14:
                readResult = "Fourteen";
                break;
            case  15:
                readResult = "Fifteen";
                break;
            case  16:
                readResult = "Sixteen";
                break;
            case  17:
                readResult = "Seventeen";
                break;
            case  18:
                readResult = "Eighteen";
                break;
            case  19:
                readResult = "Nineteen";
                break;
            default:
                readResult = "";
                break;
        }
        System.out.print(readResult);
    }

    static void readTens (int number) {
        String readResult;
        switch (number) {
            case  20:
                readResult = "Twenty";
                break;
            case  30:
                readResult = "Thirty";
                break;
            case  40:
                readResult = "Forty";
                break;
            case  50:
                readResult = "Fifty";
                break;
            case  60:
                readResult = "Sixty";
                break;
            case  70:
                readResult = "Seventy";
                break;
            case  80:
                readResult = "Eighty";
                break;
            case  90:
                readResult = "Ninety";
                break;
            default:
                readResult = "";
                break;
        }
        System.out.print(readResult);
    }
}
