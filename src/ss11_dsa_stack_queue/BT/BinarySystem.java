package ss11_dsa_stack_queue.BT;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        while (number > 0) {
            stack.push(number%2);
            number /=2;
        }
        System.out.println("Result:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
