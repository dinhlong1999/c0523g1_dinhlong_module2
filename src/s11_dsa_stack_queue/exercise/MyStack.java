package s11_dsa_stack_queue.exercise;

import java.util.ArrayList;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> mWord = new Stack<>();
        Stack<Integer> wStack = new Stack<>();
        mWord.push(10);
        mWord.push(20);
        mWord.push(30);
        mWord.push(40);
        mWord.push(50);
        System.out.println("Array before swap: " + mWord);

        while (!mWord.empty()){
            wStack.push(mWord.pop());
        }
        System.out.println("Array after swap: " + wStack);




    }

}







