package ss02_vonglap.practice;

import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please import your number? ");
        int number = scanner.nextInt();
        if (number < 2 ) {
            System.out.println(number + " is NOT a Prime number. ");
        }else {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i ==0) {
                    count++;
                }
            }
            if (count ==2) {
                System.out.println(number + " is a Prime number. ");
            }else {
                System.out.println(number + " is NOT a Prime number. ");

            }
        }
    }
}
