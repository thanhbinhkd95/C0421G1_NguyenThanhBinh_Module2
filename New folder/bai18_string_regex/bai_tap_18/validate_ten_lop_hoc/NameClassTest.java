package bai18_string_regex.bai_tap_18.validate_ten_lop_hoc;

public class NameClassTest {
    public static NameClass nameClass;
    public static final String[] validNameClass = new String[] { "P0238G", "P0318G", "C0318H", "C0318K","C0318I" };
    public static final String[] invalidNameClass = new String[] { "P0238GG", "E0238G", "P02398G", "P023G" };
    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String name : validNameClass) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidNameClass) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
    }
}
