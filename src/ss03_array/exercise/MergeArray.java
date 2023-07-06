package ss03_array.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[];
        int size1;
        int arr2[];
        int size2;
        System.out.println("Enter a quality of array 1: ");
        size1 = scanner.nextInt();
        arr1 = new int[size1];
        int i = 0;
        while (i < size1) {
            System.out.print("Enter a element for array1 No." + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Array 1:");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }
        System.out.println();
        System.out.println("Enter a quality of array 2: ");
        size2 = scanner.nextInt();
        arr2 = new int[size2];
        int k = 0;
        while (k < size2) {
            System.out.print("Enter a element for array2 No." + (k + 1) + " : ");
            arr2[k] = scanner.nextInt();
            k++;
        }
        System.out.println("Array 2:");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");
        }
        System.out.println();
        int arr3[] = new int[arr1.length + arr2.length];
        for (int j = 0; j < arr1.length; j++) {
            arr3[j] = arr1[j];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[j + arr1.length] = arr2[j];
        }
        System.out.println("Array 3");
        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j] + "\t");
        }
    }
}
