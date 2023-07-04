package ss02_vonglap.practice;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please import your number a ?");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Please import your number b ?");
        int b = Integer.parseInt(sc.nextLine());
        a= Math.abs(a);
        b= Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }while (a != b ){
            if (a > b){
                a = a - b;

            }else{
                b = b - a;
            }
        }
        System.out.println("Greatest common factor is " + a);

    }
}
