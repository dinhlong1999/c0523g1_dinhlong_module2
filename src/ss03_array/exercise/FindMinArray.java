package ss03_array.exercise;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        int size = 0;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        size = scanner.nextInt();
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter a element No." + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
        int min = arr[0];
        int index = 0;
        for (int j = 1; j < args.length; j++) {
            if (min < arr[j]) {
                min = arr[j];
                index = i;
            }
        }
        System.out.println("Element min is: " + min + " at index = " + index);
    }
}
