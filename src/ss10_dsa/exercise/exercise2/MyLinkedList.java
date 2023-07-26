package ss10_dsa.exercise.exercise2;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public MyLinkedList(){
    }
    public void add(int index, E element){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next =holder;
        numNodes++;
    }
    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }


}



