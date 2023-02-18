import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] ages = new Integer[]{34, 22, 56, 2, 17};
        Comparator<Integer> compare = (left, right) -> (int)(left-right);
//        Sorting.bubbleSort(ages, compare);
//        Sorting.selectionSort(ages, compare);
        Sorting.insertionSort(ages, compare);
        System.out.println("hey");

    }
}
