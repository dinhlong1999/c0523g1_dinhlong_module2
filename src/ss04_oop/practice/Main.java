package ss04_oop.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.print("Enter a width");
        double width = scanner.nextDouble();
        System.out.print("Enter a height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

    }
}
