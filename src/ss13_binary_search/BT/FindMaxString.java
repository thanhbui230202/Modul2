package ss13_binary_search.BT;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for(Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}