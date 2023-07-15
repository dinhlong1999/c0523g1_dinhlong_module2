package ss10_dsa.exercise.exercise1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList1 = new MyList<Integer>();
        MyList<Integer> myList2 = new MyList<>(10);
        myList1.add(10);
        myList1.add(20);
        myList1.add(30);
        myList1.add(40);
        myList1.add(50);
        myList1.add(60);
        myList1.add(70);
        myList1.add(80);
        myList1.add(90);
        myList1.add(9, 100);
//        myList1.add(13,130);  Them phan tử vào  khi size đã full
//        System.out.println("New Array = "+ myList1.clone());  sao chep sang mang moi
//        System.out.println( myList1.size());     lay size cua mang hien tai
//        System.out.println(myList1.remove(4));    xoa phan tu o vi tri thu 4
//        myList1.contains(100);  tim phan tu co trong mang
        System.out.println("Index of element: " + myList1.indexOf(40));

    }
}