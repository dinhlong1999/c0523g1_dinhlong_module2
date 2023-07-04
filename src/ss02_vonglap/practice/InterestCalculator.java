package ss02_vonglap.practice;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please import money you sent? ");
        double money = Double.parseDouble(sc.nextLine());
        System.out.println("Please import monthly interest rate? ");
        double rate = Double.parseDouble(sc.nextLine());
        System.out.println("Please import month sent? ");
        int month = Integer.parseInt(sc.nextLine());
         double total =0;
        for (int i = 0; i < month; i++) {
            total += money *((rate/100)/ 12 ) * month;
        }
        System.out.println("Total in interest " + total);
    }


}
