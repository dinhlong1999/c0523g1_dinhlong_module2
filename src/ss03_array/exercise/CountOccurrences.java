package ss03_array.exercise;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        int count = 0;
        String text = "dinhlong";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scanner.nextLine().charAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
