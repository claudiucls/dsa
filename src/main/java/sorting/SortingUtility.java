package sorting;

public class SortingUtility {

    public int[] bubbleSort(int[] array) {
        int temp=0;
        int size = array.length;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < (size-i); j++){
                if(array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
