package SS3_Array_and_Method.BT;

public class Merge_Element {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,5,6};
        int[]arr2 = {7,8,9,10,11,12};
        int size3 = arr1.length+arr2.length;
        int arr3[]= new int[size3];
        for (int i = 0; i < size3-arr2.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < size3-arr1.length ; i++) {
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println("Merge Array");
        for (int i:arr3){
            System.out.print(i+" ");
        }
    }
}
