package ss14_search_algorithm.BT;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int []arr = {5,12,4,7,8,9,3,67,1};
        insertionSort(arr);
        for (int o : arr){
            System.out.println(o);
        }
    }
}
