package ss03_array.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quality element: ");
        int quality = input.nextInt();
        int arr[] = new int[quality];
        int i = 0;
        while (i < quality) {
            System.out.print("Enter an element" + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int arrNew[] = new int[arr.length + 1];
        System.out.println("Enter a number you want add");
        int number = input.nextInt();
        System.out.println("Enter position you want add");
        int position = input.nextInt();
        if (position <= -1 && position >= arr.length - 1) {
            System.out.println("No add");
        } else {
            for (int j = 0; j < position; j++) {
                arrNew[j] = arr[j];
            }
            arrNew[position] = number;
            for (int j = position + 1; j < arrNew.length; j++) {
                arrNew[j] = arr[j - 1];
            }
        }
        for (int j = 0; j < arrNew.length; j++) {
            System.out.print(arrNew[j] + "\t");
        }
    }


}


