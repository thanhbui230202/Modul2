package SS3_Array_and_Method.BT;

import java.util.Scanner;

public class Count_Character_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        System.out.println("Enter the character want check");
        char charCheck = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (charCheck == character) {
                count++;
            }
        }
        System.out.println("The number of occurrences in string: "+count);
    }
}