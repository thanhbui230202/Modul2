package SS2_Loop_Statement.BT;

import java.util.Scanner;

public class Show_image {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    for (int i = 1; i <=3 ; i++){
                        for (int j = 1; j <=7;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("bottom-left");
                    for(int i=1; i<=5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("top-left");
                    for(int i=5; i>=1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("bottom-right");
                    for(int i=1; i<=5; i++) {
                        for (int j = 5; j >= 1; j--) {
                            if (j <= i){
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    System.out.println("top-right");
                     for(int i=5; i>=1; i--) {
                        for (int j = 5; j >= 1; j--) {
                            if (j <= i){
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    int size=5;
                    for(int i = 1; i <= size; i++){
                        for(int j = 1; j <= size-i; j++){
                            System.out.print(" ");
                        }
                        for(int k = 1; k<= 2*i-1; k++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
