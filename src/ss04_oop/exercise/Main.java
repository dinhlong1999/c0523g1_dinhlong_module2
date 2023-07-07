package ss04_oop.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter a number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter a number c: ");
        double c = scanner.nextDouble();
        System.out.println("The equation has the form: "+ a +"x^2 +"  +b+ "x +" + c + "=0");

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("the equation has two roots: Root1: " + quadraticEquation.getRoot1()+ "and Root 2: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: Root =" + quadraticEquation.getRoot());
        }else  {
            System.out.println("The equation haven't root");
        }


    }
}
