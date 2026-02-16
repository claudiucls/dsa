import sorting.SortingUtility;

public class SortMain {

    public static void main(String[] args) {

        int[] array = new int[]{3,23,14,34,12,4,6};

        System.out.print("Before sorting: ");
        for(int n: array)
            System.out.print(n+" ");

        System.out.println();
        SortingUtility sortingUtility = new SortingUtility();
        array = sortingUtility.bubbleSort(array);

        System.out.print("After sorting: ");
        for(int n: array)
            System.out.print(n+" ");
        System.out.println();
    }
}
