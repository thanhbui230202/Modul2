package ss11_dsa_stack_queue.BT;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReservesArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int stackArr[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size array");
        int Size_arr = Integer.parseInt(scanner.nextLine());
        stackArr = new int[Size_arr];
        for (int a = 0; a < Size_arr; a++) {
            System.out.println("Arr[" + a + "]");
            stack.push(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(stack);
        for(int i = 0; i< stackArr.length;i++){
            stackArr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(stackArr));
    }
}
