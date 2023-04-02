package SS3_Array_and_Method.BT;

import java.util.Scanner;

public class Delete_Element {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        arr = new int[size];
        int i =0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter the number want to delete: ");
        int num = scanner.nextInt();
        int index_dl;
        boolean check = false;
        for (int j = 0; j < size;j++){
            if (num == arr[j]){
                index_dl = j;
                check = true;
                for (int k = index_dl;index_dl<size-1;index_dl++){
                    arr[k] = arr[k+1];
                }
            }
        }
        if (check){
            System.out.println("New array");
            for (int h = 0; h < size-1;h++){
                System.out.print(arr[h]+" ");
            }
        }else {
            System.out.println(num+" "+"Dont have in array");
        }
    }
}
