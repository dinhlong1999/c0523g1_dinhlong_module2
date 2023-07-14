package exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please import your name: ");
        String name = scanner.nextLine();
        System.out.println("hello " + name);
    }
}
