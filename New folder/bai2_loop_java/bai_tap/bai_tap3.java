package bai2_loop_java.bai_tap;

public class bai_tap3 {
    static boolean CheckPrime(int number) {
        if (number < 2) {
            return false;
        }
        int count = 0;
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int i =0;i<100;i++){
            if(CheckPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
