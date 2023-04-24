package ss11_dsa_stack_queue.BT;

import java.util.Scanner;
import java.util.Stack;

public class Check {
    public static void main(String[] args) {
        String string1 = "s * ( s – a) * (s – b) * (s – c)";
        String string2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a  ";
        System.out.println(CheckKey(string1));
        System.out.println(CheckKey(string2));
    }
    public static boolean CheckKey(String str){
        Stack<String> stackChar = new Stack<String>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == ')') {
                if (str.charAt(i) == ')') {
                    if (stackChar.isEmpty()) {
                        return false;
                    } else if (stackChar.peek().equals("(")) {
                        stackChar.pop();
                    } else {
                        return false;
                    }
                } else {
                    String s = String.valueOf(str.charAt(i));
                    stackChar.push(s);
                }
            }
        }
        if (!stackChar.isEmpty()) {
            return false;
        }
        return true;
    }
}
