package SS3_Array_and_Method.BT;

import java.util.Scanner;

public class Sum_Value_Column {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row");
        int m = scanner.nextInt();
        System.out.println("Enter the column");
        int n = scanner.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the element for the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the column you want sum");
        int colNum = scanner.nextInt();
        double sum =0;
        for (int i = 0; i < n; i++) {
            sum+=arr[colNum][i];
        }
        System.out.println("Sum value in column:"+" "+ colNum+" is: "+sum);
    }
}
