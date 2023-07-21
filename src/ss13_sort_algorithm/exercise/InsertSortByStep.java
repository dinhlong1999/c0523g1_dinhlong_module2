package ss13_sort_algorithm.exercise;

import java.util.Scanner;

public class InsertSortByStep {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr[" + (i + 1) + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Not sort:");
        for (Integer integer1 : arr) {
            System.out.print(integer1 + "\t");
        }
        System.out.println();
        System.out.println("After sorted:");
        insertSort(arr);
        for (Integer integer2 : arr) {
            System.out.print(integer2 + "\t");
        }
    }
}
