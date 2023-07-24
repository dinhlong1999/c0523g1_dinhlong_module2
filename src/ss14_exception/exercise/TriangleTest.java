package ss14_exception.exercise;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an edge1: ");
            double edge1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter an edge2: ");
            double edge2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter an edge3: ");
            double edge3 = Double.parseDouble(scanner.nextLine());
            try {
                check.triangleEdgesCheck(edge1, edge2, edge3);
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }
        }catch (NumberFormatException ex){
            System.out.println("Input syntax error.");
        }
    }


}
