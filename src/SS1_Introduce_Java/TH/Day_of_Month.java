package SS1_Introduce_Java.TH;

import java.util.Scanner;

public class Day_of_Month {
    public static void main(String[] args) {
        byte day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month:");
        day = scanner.nextByte();
        switch (day){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Have 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Have 31 days");
                break;
            case 2:
                System.out.println("Have 29 days");
                break;
        }
    }
}
