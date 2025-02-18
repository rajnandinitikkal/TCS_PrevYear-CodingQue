package ProblemsOnArray.Array_Sorting;

import java.util.Arrays;

public class arr {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 34, 54, 6, 23, 2 };

        sort(arr);
        parallelSort(arr);
        copyOf(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void copyOf(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " ");
        }
    }

    private static void parallelSort(int[] arr) {
        Arrays.parallelSort(arr);
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
