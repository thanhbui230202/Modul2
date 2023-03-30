package SS2_Loop_Statement.BT;

import java.util.Scanner;

public class count_prime {
    public static void main(String[] args) {
        int number,count = 0,N=2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to print: ");
        number = scanner.nextInt();
        while (count < number){
            boolean check = true;
            for (int n =2 ; n <= Math.sqrt(N);n++){
                if (N % n == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N+" ");
                count++;
            }
            N++;
        }
    }
}
