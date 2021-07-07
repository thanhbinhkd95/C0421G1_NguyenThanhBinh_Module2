package Case_study.libs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CatchAgeExceptionImp implements CatchAgeException {
    public CatchAgeExceptionImp() {
    }

    @Override
    public void checkDateOfBirth(String dayOfBirth) {
        regexDateOfBirth(dayOfBirth);
    }

    private void regexDateOfBirth(String birth) {
        String regex = "^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$";
        boolean check;
        do {
            check = Pattern.matches(regex, birth);
            if (check) {
                String[] rightBirth = birth.split("/");
                try {
                    if (Integer.parseInt(rightBirth[0]) < 1 || Integer.parseInt(rightBirth[0]) > 31
                            || Integer.parseInt(rightBirth[1]) < 1 || Integer.parseInt(rightBirth[1]) > 12
                            || Integer.parseInt(rightBirth[2]) < 1921 || Integer.parseInt(rightBirth[2]) > 2003) {
                        throw new AgeException("Tuổi phải nằm trong khoảng 18 - 100; Day < =31; Month < =12");
                    }
                } catch (AgeException ageException) {
                    System.err.println(ageException.getMessage());
                    check = false;
                    System.out.println("Nhập lại");
                    birth = new Scanner(System.in).nextLine();
                }
            } else {
                System.out.println("Nhập lại");
                birth = new Scanner(System.in).nextLine();
            }
        } while (!check);
    }
}
