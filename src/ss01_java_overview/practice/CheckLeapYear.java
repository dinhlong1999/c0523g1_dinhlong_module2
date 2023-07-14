package practice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please import the year? ");
        int year = scanner.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.printf("%d is leap year", year);
            } else {
                System.out.printf("%d is NOT leap year", year);
            }
        } else {
            if (year % 4 == 0) {
                System.out.printf("%d is leap year", year);
            }else {
                System.out.printf("%d is NOT leap year", year);
            }
        }

    }
}