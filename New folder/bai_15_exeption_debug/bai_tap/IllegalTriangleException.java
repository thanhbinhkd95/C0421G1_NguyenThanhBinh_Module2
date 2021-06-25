package bai_15_exeption_debug.bai_tap;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String inErrorMessage) {
       super(inErrorMessage);
    }
}
