package ss03_array.exercise;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int array[] = {10, 4, 6, 7, 8, 5, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want delete? ");
        int number = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                flag = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
                break;
            }
        }
        if (flag == false) {
            System.out.println("No pound");
        }
        System.out.println("After delete");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
