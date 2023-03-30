package SS2_Loop_Statement.TH;

import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 5.5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
