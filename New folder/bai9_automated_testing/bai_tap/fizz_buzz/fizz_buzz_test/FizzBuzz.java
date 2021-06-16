package bai9_automated_testing.bai_tap.fizz_buzz.fizz_buzz_test;

public class FizzBuzz {
    public static String translate(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (String.valueOf(number).contains("3")) {
            return "Fizz";
        } else if (String.valueOf(number).contains("5")) {
            return "Buzz";
        } else return readNumberToString(number);

    }

    public static String readNumberToString(int number) {
        String strNumber = String.valueOf(number);
        String[] arrayNumber = strNumber.split("");
        String resultString = "";
        if (number >= 0 && number < 100) {
            resultString = convertNumberToString(arrayNumber, resultString);
            return resultString;
        } else return "limit number less than 100";
    }

    private static String convertNumberToString(String[] arrayNumber, String resultString) {
        for (int i = 0; i < arrayNumber.length; i++) {
            switch (arrayNumber[i]) {
                case "0":
                    arrayNumber[i] = "zero";
                    break;
                case "1":
                    arrayNumber[i] = "one";
                    break;
                case "2":
                    arrayNumber[i] = "two";
                    break;
                case "3":
                    arrayNumber[i] = "three";
                    break;
                case "4":
                    arrayNumber[i] = "four";
                    break;
                case "5":
                    arrayNumber[i] = "five";
                    break;
                case "6":
                    arrayNumber[i] = "six";
                    break;
                case "7":
                    arrayNumber[i] = "seven";
                    break;
                case "8":
                    arrayNumber[i] = "eight";
                    break;
                case "9":
                    arrayNumber[i] = "night";
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
        for (String a : arrayNumber) {
            resultString += a + " ";
        }
        return resultString;
    }
}
