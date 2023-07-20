package ss13_search_algorithm.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RecursiveAlgorithm {

    public static int binarySearch(ArrayList<Integer> array, int left, int right, int value) {

        while (left < right) {
            int mid = (left + right) / 2;
            if (array.get(mid) == value) {
                return mid;
            } else if (array.get(mid) > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length of array: ");
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter an element arr" + (i + 1));
            arrayList.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Array is not yet ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
        System.out.println();
        Collections.sort(arrayList);
        System.out.println("Sorted array");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
        System.out.println();
        System.out.println("Enter a number check");
        int value = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(arrayList, 0, arrayList.size() - 1, value);
        if (result >= 0) {
            System.out.println("Index of element: " + result);
        } else {
            System.out.println("No pound element. Good luck");
        }
    }
}



