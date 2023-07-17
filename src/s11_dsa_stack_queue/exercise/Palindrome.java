package s11_dsa_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string to check:  ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[]arr = str.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            queue.offer(arr[i]);
        }
        boolean flag = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("String is a palindrome");
        }else {
            System.out.println("String isn't a palindrome");
        }
    }
}

