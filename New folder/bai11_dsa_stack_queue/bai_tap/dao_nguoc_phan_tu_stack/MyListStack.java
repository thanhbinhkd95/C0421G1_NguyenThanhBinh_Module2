package bai11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyListStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Trước khi đảo mảng: "+ Arrays.toString(array));
        System.out.println("Sau khi đảo mảng: "+ Arrays.toString(MyListStack.reverseArray(array)));
        String string = "Mr Chanh Tran Van";
        System.out.println("Sau khi đảo: "+ MyListStack.reverseString(string));
    }
    public static int[] reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }
        int[] result = new int[array.length];
        for(int j=0;j<array.length;j++){
            result[j]=stack.pop();
        }
        return result;
    }
    public static String reverseString(String string) {
        Stack<Character> wStack = new Stack<>();
        char[] arr = string.toCharArray();
        for (int i = string.length() - 1; i >= 0; i--) {
            wStack.push(arr[i]);
        }
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result += wStack.get(i);
        }
        return result;
    }
}

