package s11_dsa_stack_queue.practice;



public class MyLinkedListQueue {
    public Node head;
    private Node tail;
    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }else {
            this.tail.next = temp;
            this.tail = temp;
        }
    }
    public Node dequeue(){
        if (this.head == null)
            return null;
        Node temp = head;
        this.head = this.head.next;
        if (this.head ==null)
            this.tail = null;
            return temp;



    }
}
