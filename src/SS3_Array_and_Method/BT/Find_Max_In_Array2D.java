package SS3_Array_and_Method.BT;

import java.util.Scanner;

public class Find_Max_In_Array2D {
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
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j])
                    max = arr[i][j];
            }
        }
        System.out.println("Max element: "+max);
    }
}