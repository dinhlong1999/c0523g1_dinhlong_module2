package ss13_sort_algorithm.exercise;

public class InsertSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 6, 7, 8, 2, 3, 1};
        insertionSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer + "\t");

        }
    }
}
