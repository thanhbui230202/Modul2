package SS3_Array_and_Method.BT;

import java.util.Scanner;

public class Sum_Main_Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter element for the matrix: ");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i <n;i++){
            for (int j = 0; j<n;j++){
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum element: "+sum);
    }
}
