import search.SearchUtility;

public class SearchMain {

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6,8,10,14,16,17};
        SearchUtility searchUtility = new SearchUtility();
        int searchValue = 19;
        int result = searchUtility.binarySearch(array, searchValue);
        System.out.println("For binary we got the result at "+result+" position and it took " + searchUtility.timeComplexity + " steps");
        result = searchUtility.linearSearch(array, searchValue);
        System.out.println("For liniar we got the result at "+result+" position and it took " + searchUtility.timeComplexity + " steps");


    }
}
