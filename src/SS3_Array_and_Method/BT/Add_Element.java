package SS3_Array_and_Method.BT;

import java.util.Scanner;

public class Add_Element {
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
        System.out.println("Enter the number want to add in array");
        int num = scanner.nextInt();
        System.out.println("Enter the position want to add in array");
        int index_add = scanner.nextInt();
        boolean check = true;
        int[] newArr = new int[arr.length+1];
        for (int j = 0;j < size; j++){
            if (index_add <= 1 && index_add >=size){
                check = false;
                System.out.println("Can't not add element into array");
            }else {
                for (int k =0 ; k < index_add;k++){
                    newArr[k] = arr[k];
                    newArr[index_add] = num;
                }
                for (int h = index_add+1;h <size+1;h++){
                    newArr[h] = arr[h-1];
                }
            }
        }
        if (check){
            System.out.println("New array");
            for (int h = 0; h < size+1;h++){
                System.out.print(newArr[h]+" ");
            }
        }
    }
}
