package s11_dsa_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string you want check: ");
        String str = scanner.nextLine();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(") || arr[i].equals(")")){
                stack.push(arr[i]);
            }
        }
        if(stack.get(0).equals("(")){
            if (stack.get(3).equals(")")){
                System.out.println("Well");
            }else {
                System.out.println("???");
            }
        }else {
            System.out.println("???");
        }
    }
}