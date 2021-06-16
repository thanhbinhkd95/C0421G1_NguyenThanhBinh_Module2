package bai11_dsa_stack_queue.bai_tap;

import java.util.Stack;

public class MyStack {

    public static String chuyenThapPhanSangNhiPhan(int number) {
        Stack<Integer> stack = new Stack<Integer>();
        String result = "";
        while (number != 0) {
            int d = number % 2;
            stack.push(d);
            number /= 2;
        }
        while (!(stack.isEmpty())) {
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        String a = chuyenThapPhanSangNhiPhan(999);
        System.out.println("Mã nhị phân là: " + a);
    }
}
