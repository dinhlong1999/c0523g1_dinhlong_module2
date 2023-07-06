package ss03_array.exercise;

import java.util.Scanner;

public class CalculatorSum {
    public static void main(String[] args) {
//        int[][] array = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {4, 6, 8, 0}
//        };
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row: ");
        row = scanner.nextInt();
        System.out.println("Enter a col: ");
        col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter a element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("What colum you want calculator? ");
        int colum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][colum];
        }
        System.out.println("Total of " + col + " = " + sum);
    }

}



