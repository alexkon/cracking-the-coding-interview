package chapter11.sorting.and.searching;


public class BinarySearch {

    public static int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] < x) {
                low = mid + 1;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 10;
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(String.format("%d %d", a[i], binarySearch(a, i + 1)));
        }
    }
}
