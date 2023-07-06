package ss03_array.exercise;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int m;

        System.out.print("Enter n > 0: ");
        n = scanner.nextInt();
        System.out.print("Enter m > 0: ");
        m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter a array[" + i + "," + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max;
        int row = 0;
        int col = 0;
        max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Max of arr: " + max + " at position " + "row" + " = " + row + " and " + "col" + " = " + col);
    }
}
