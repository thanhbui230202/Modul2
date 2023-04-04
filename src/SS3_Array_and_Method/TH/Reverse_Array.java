package SS3_Array_and_Method.TH;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverse_Array {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
    static void reverse (Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Enter a size:");
//            size = scanner.nextInt();
//            if (size > 20)
//                System.out.println("Size does not exceed 20");
//        } while (size > 20);
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter element " + (i+1) + ": ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//        System.out.printf("%-20s%s", "Elements in array: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//        for (int j = 0; j < array.length / 2; j++) {
//            int temp = array[j];
//            array[j] = array[size - 1 - j];
//            array[size - 1 - j] = temp;
//        }
//        System.out.printf("\n%-20s%s", "Reverse array: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
    }
//}
