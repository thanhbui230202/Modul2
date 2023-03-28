package SS1_Introduce_Java.BT;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        long rate = 23000,usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money($): ");
        usd = scanner.nextLong();
        long result = usd * rate;
        System.out.println("Your money change VNĐ to Dollar: "+result);
    }
}
