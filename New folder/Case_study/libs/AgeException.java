package Case_study.libs;

public class AgeException extends Exception {
    public static void main(String[] args) {
        System.out.println(new AgeException("alalaal").getMessage());
    }
    public AgeException(String message) {
        super(message);
    }
}
