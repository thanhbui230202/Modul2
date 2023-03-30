package SS3_Array_and_Method.BT;

import java.util.Scanner;

public class Delete_Element {
    public static void main(String[] args) {
        int [] numberArr ={1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number want to delete: ");
        int num = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < numberArr.length;i++){
            if (num == numberArr[i]){
                index = numberArr[i];
                int newArr = numberArr[i] - index;
            }
        }
        System.out.println(newArr);
    }
}
