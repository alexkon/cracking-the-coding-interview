package chapter11.sorting.and.searching;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];

        while (left <= right) {

            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }


    public static void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }

        if (right > index) {
            quickSort(array, index, right);
        }
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 4, 3, 10, 7, 9, 6, 8, 1};
        Arrays.stream(a).forEach(i -> System.out.printf("%d ", i));
        System.out.println();
        quickSort(a);
        Arrays.stream(a).forEach(i -> System.out.printf("%d ", i));
    }
}
