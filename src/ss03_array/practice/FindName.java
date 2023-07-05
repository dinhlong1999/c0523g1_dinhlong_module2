package ss03_array.practice;

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String students[] = {"Ronaldo", "Messi", "Thor", "Hulk"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                isExist = true;
                System.out.println("Position of the students in the list: " + input_name + " is " + i);
                break;
            }
        }
        if (!isExist == true) {
            System.out.println("Not found " + input_name + "of the list");
        }
    }
}
