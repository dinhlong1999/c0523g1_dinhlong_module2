package ss03_array.exercise;

import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int[][] array;
        do {
            System.out.println("Enter a square edge ");
            row = scanner.nextInt();
            if (row < 0) {
                System.out.println("No invalid, square edge > 0 ");
            }
        } while (row < 0);
        array = new int[row][row];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("Enter a array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum= 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ( i == j ) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Total main diagonal: " + sum);
    }
}