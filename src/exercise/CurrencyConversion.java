package exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please import your USD");
        int usd = scanner.nextInt();
        int sum = usd * 23000;
        System.out.println(usd + " USD = " + sum + " VND");
    }


}
