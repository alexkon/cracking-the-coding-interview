package chapter11.sorting.and.searching;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, helper, low, middle);
            mergeSort(array, helper, middle + 1, high);
            merge(array, helper, low, middle, high);
        }
    }

    private static void merge(int[] array, int[] helper, int low, int middle, int high) {
        // copy elements to helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        // define helper pointers
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        // iterate with both sides and put the min element into current array
        while(helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        // put remain left side to current array
        int remain = middle - helperLeft;
        for (int i = 0; i <= remain; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    public static void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length -1);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 4, 3, 10, 7, 9, 6, 8, 1};
        Arrays.stream(a).forEach(i -> System.out.printf("%d ", i));
        System.out.println();
        mergeSort(a);
        Arrays.stream(a).forEach(i -> System.out.printf("%d ", i));
    }
}
