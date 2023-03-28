package SS1_Introduce_Java.TH;

import java.util.Scanner;

public class PT_Bac1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a:");
        a = scanner.nextInt();
        System.out.println("Nhập vào hệ số b");
        b = scanner.nextInt();
        if ( a == 0 && b == 0){
            System.out.println("Phương trình có vô số nghiệm");
        }
        else if (a == 0 && b !=0) {
            System.out.println("Phương trình vô nghiệm");
        }else if(a != 0) {
            int x = (-b)/a;
            System.out.println("Phương trình có 1 nghiệm duy nhất = "+x);
        }

    }
}

