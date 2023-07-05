package ss02_vonglap.exercise;


import java.util.Scanner;

public class DisplayTemplate {
    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle ");
            System.out.println("2. Print the square triangle bot-left ");
            System.out.println("3. Print the square triangle top-left ");
            System.out.println("4. Print the square triangle bot-right ");
            System.out.println("5. Print the square triangle top-right ");
            System.out.println("6. Print isosceles triangle");
            System.out.println("7. Exit ");
            System.out.println("Enter the choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Please import width: ");
                    int width = scanner1.nextInt();
                    System.out.println("Please import height:");
                    int height = scanner1.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Please import width: ");
                    int widthTriangle = scanner2.nextInt();
                    for (int i = 0; i < widthTriangle; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Please import width: ");
                    int topLeft = scanner3.nextInt();
                    for (int i = 0; i < topLeft; i++) {
                        for (int j = topLeft - i; j > 0; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Please import width: ");
                    int botRight = scanner4.nextInt();
                    for (int i = 0; i < botRight; i++) {
                        for (int j = 0; j < botRight; j++) {
                            if (j <botRight - i) {
                                System.out.print(" ");
                            }else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Please import width: ");
                    int topRight = scanner5.nextInt();
                    for (int i = 0; i < topRight; i++) {
                        for (int j = topRight ; j > 0; j--) {
                            if (j > topRight-i) {
                                System.out.print(" ");
                            }else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Please import width: ");
                    int isosceles = scanner6.nextInt();
                    for (int i = 0; i < isosceles; i++) {
                        for (int k = isosceles; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
