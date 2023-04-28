package ss13_binary_search.BT;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int search(int [] array,int left,int right,int value){
        left = 0;
        right = array.length-1;
        while (left <= right){
            int middle = (left+right)/2;
            if (array[middle] == value){
                return middle;
            } else if (array[middle] > value) {
                right = middle-1;
            }else {
                left = middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i =0; i<arr.length;i++){
            System.out.println("Enter the element["+i+"]");
            arr[i] = scanner.nextInt();
        }
        for (int q : arr) {
            System.out.println(q);
        }
        Arrays.sort(arr);
        System.out.println("Have arrange");
        for (int q : arr) {
            System.out.println(q);
        }
        System.out.println("Enter the element you want search:");
        int num = scanner.nextInt();
        if (search(arr,0,arr.length-1,num) != -1){
            System.out.println(+num +" have in array");
        }else {
            System.out.println(+num +" dont have in array");
        }
    }
}
