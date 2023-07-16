package s11_dsa_stack_queue.practice;

public class GenericStackClient {
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Long");
        stack.push("Van");
        stack.push("Hanh");
        stack.push("Duyen");
        stack.push("Lan");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%s \t", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations: " + stack.size() );
    }
    public static void  stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operations: " + stack.size());
        System.out.println("2.2 Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%s \t", stack.pop());
        }
        System.out.println("\n2.3. Size of stack after pop operations: " + stack.size() );
    }

    public static void main(String[] args) {
        System.out.println("1.Stack of integers: ");
        stackOfIntegers();
        System.out.println("2.Stack of Strings: ");
        stackOfIStrings();
    }
}
