import java.util.Comparator;

/**
 * Your implementation of various iterative sorting algorithms.
 */
public class Sorting {

    /**
     * Implement bubble sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * NOTE: You should implement bubble sort with the last swap optimization.
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        int end = arr.length - 1;
        int start = 0;
        T swapped;
        int swappedIndex = end;
        while (start < end){
            swappedIndex = start;
            for (int i = 0; i < end; i++){
                if (comparator.compare(arr[i], arr[i+1]) > 0){
                    swapped = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swapped;
                    swappedIndex = i;
                }
            }
            end = swappedIndex;
        }

    }

    /**
     * Implement selection sort.
     *
     * It should be:
     * in-place
     * unstable
     * not adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n^2)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        //Loop through from back to front decrementing each go
            //Store the most right item in variable (max item)
            //Loop through item to the left
                //If bigger then max item equals that
            //At end of loop store max item at end of array
            //decreement loop by 1
        int length = arr.length;
        int startLocation = length - 1;
        while (startLocation > 0){
            int maxIndex = startLocation;
            T max = arr[startLocation];
            for (int i = startLocation - 1; i >= 0; i--){
                if (comparator.compare(arr[i], max) > 0){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            T temp = arr[startLocation];
            arr[startLocation] = max;
            arr[maxIndex] = temp;
            startLocation--;
        }
    }

    /**
     * Implement insertion sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        //Loop through from left to right checking the two items
            //Swap if right is less than right
                //Keep swaping to the front of the left half if needed
            //Once done, update the start point of the loop from where the swap happened as left side is fully sorted
        int length = arr.length;
        for (int i = 0; i < length - 1; i++){
            boolean swappHappened = true;
            int searchingIndex = i + 1;
            while (searchingIndex > 0 && swappHappened){
                if (comparator.compare(arr[searchingIndex], arr[searchingIndex - 1]) < 0){
                    T temp2 = arr[searchingIndex];
                    arr[searchingIndex] = arr[searchingIndex - 1];
                    arr[searchingIndex - 1] = temp2;
                    searchingIndex--;
                    continue;
                }
                swappHappened = false;
            }
        }

    }
}