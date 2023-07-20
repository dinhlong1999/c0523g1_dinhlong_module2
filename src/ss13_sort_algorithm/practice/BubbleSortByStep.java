package ss13_sort_algorithm.practice;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Enter " + size + " value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: ");
        for (Integer integer : arr) {
            System.out.print(integer + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(arr);

    }
    public static void bubbleSortByStep(int[] arr){
        boolean needNextPass = true;
        for (int i = 0; i < arr.length -1; i++) {
            needNextPass = false;
            for (int j = arr.length -1; j > i ; j--) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + i + " sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}

