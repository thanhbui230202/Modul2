package SS1_Introduce_Java.BT;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Hello: "+name);

    }
}
