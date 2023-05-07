package ss14_search_algorithm.BT;

public class InsertionSortReview {
    public static void insertionSortreview(int[] array)
    {
        int i, key, j;
        for (i = 1; i < array.length; i++)
        {
            key = array[i];
            j = i-1;

            while (j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int []arr1 = {1,5,7,8,3,2,4,9,11,257,19};
        insertionSortreview(arr1);
        for (int o : arr1){
            System.out.println(o);
        }
    }
}
