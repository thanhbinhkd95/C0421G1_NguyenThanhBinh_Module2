package bai11_dsa_stack_queue.bai_tap.kiem_tra_palindrome_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean checkPalindrome(String string){
        string =string.toLowerCase();
        Stack<Character> stringStack = new Stack<>();
        Queue<Character> stringQueue = new LinkedList<>();
        for(int i =0;i<string.length();i++){
            stringStack.push(string.charAt(i));
            stringQueue.add(string.charAt(i));
        }
        for(int i =0;i<string.length();i++){
            if(!stringStack.pop().equals(stringQueue.poll())){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        System.out.println(checkPalindrome(string));
    }
}
