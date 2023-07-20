package ss13_sort_algorithm.practice;

public class SelectSort {
    public static void selectSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {
        double[] arr = {1.1, 5.4, 3.4, 2.1};
        selectSort(arr);
        for (Double element : arr) {
            System.out.print(element + "\t");
        }
    }
}


