package s11_dsa_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number decimal your want check: ");
        int decimal = scanner.nextInt();
        int binary;
        String str = "";
        Stack<Integer> stack = new Stack<>();
        do {
        binary = decimal % 2 ;
        decimal = decimal / 2;
        stack.push(binary);
    }while ( decimal > 0);
        while (!stack.isEmpty()){
            str += stack.pop();
        }
        System.out.print("Binary number is:  " + str);
}


}
