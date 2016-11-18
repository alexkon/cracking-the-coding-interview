package chapter11.sorting.and.searching;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 4, 3, 10, 7, 9, 6, 8, 1};
        Arrays.stream(a).forEach(i -> System.out.printf("%d ", i));
        System.out.println();
        bubbleSort(a);
        Arrays.stream(a).forEach(i -> System.out.printf("%d ", i));
    }
}
