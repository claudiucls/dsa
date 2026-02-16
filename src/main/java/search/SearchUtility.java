package search;

public class SearchUtility {

    public static int timeComplexity = 0;

    public int linearSearch(int[] array, int searchValue){
        timeComplexity = 0;
        for (int i = 0; i < array.length; i++) {
            timeComplexity++;
            if(array[i] == searchValue)
                return i;
        }
        return -1;
    }

    public int binarySearch(int[] array, int searchValue){
        timeComplexity = 0;
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middle;
        while(startIndex <= endIndex){
            timeComplexity++;
            middle = (startIndex+endIndex)/2;
            if(array[middle] == searchValue)
                return middle;
            else if(array[middle] < searchValue)
                startIndex = middle + 1;
            else
                endIndex = middle-1;
        }
        return -1;
    }

}
