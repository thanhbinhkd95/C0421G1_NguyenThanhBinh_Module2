package bai11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        boolean result = checkBracket(")()()( ");
        System.out.println(result?"Well":"???");
    }
    public static boolean checkBracket(String sym) {
        Stack<Character> bStack = new Stack();
        for (int i = 0; i < sym.length(); i++) {
            char left;
            if (sym.charAt(i) == '(') {
                bStack.push(sym.charAt(i));
                continue;
            } else if (sym.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    left = bStack.pop();
                    if (!(left == '(' && sym.charAt(i) == ')')) return false;
                }
            }
//            else if(sym.charAt(i)=='^'){
//                if (!bStack.isEmpty()) {
//                    return false;
//                }
//        }
            else continue;
        }
        if (bStack.isEmpty()) return true;
        else return false;
    }
}


