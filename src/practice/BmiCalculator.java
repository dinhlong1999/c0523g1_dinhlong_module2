package practice;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please import the weight? ");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.print("Please import the height? ");
        float height = Float.parseFloat(scanner.nextLine());
        float bmi = weight / (height * height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi,"Underweight");
        }else if( bmi < 25.0){
            System.out.printf("%-20.2f%s", bmi,"Normal");
        }else if( bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi,"OverWeight");
        }else {
            System.out.printf("%-20.2f%s", bmi,"Obese");
        }
    }
}
