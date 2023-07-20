package ss13_sort_algorithm.practice;

public class BubbleSort {
    static int[] arr = {5, 3, 9, 10, 1, 14, 8};

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer + "\t");
        }
    }
}

