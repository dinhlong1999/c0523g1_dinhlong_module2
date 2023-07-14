package ss10_dsa.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;


public class MyList<E> {
    private int size=0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        System.out.println("Array have length: " + DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            System.out.println("No valid ");
        }
        size = 0;
    }

    public void ensureCape(int minCapacity) {
        if (minCapacity > 0){
            int newElements = minCapacity + this.elements.length;
            Arrays.copyOf(elements,newElements);
            System.out.println("Increase array with size =" + elements.length);
        }
        else {
            System.out.println("No valid");
        }
    }

    public void add(int index, Object element) {
       if (index >= elements.length) {
           System.out.println("Array had full");
           Scanner scanner = new Scanner(System.in);
           System.out.println("input you want increase");
           int num  = Integer.parseInt(scanner.nextLine());
           this.ensureCape(num);
           for (int i = index; i < elements.length -1; i++) {
               elements[i+1] = elements[i];
           }
           System.out.println("Success");
           elements[index] = element;
           size++;
       }else {
           for (int i = index; i < elements.length -1; i++) {
               elements[i+1] = elements[i];
           }
           elements[index] = element;
           size++;
       }
        System.out.println(Arrays.toString(elements));
    }

    private void checkIndex(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
    }

    public Object remove(int index) {
        checkIndex(index);
        Object objectRemove = elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[size - 1] = null;
        size--;
        return Arrays.toString(elements);

    }

    public Object clone() {
        Object newObject[] = new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            newObject[i] = elements[i];
        }
        return newObject;
    }

    public boolean contains(Object objectContains) {
        for (int i = 0; i < size; i++) {
            if (objectContains.equals(elements[i])) {
                System.out.println("Array have: " + objectContains);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object objectIndex) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (objectIndex == elements[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(Object objectAdd) {
        if (size == elements.length) {
            ensureCape(1);
        }
        elements[size] = objectAdd;
        size++;
        return true;
    }
    public Object get(int index){
        checkIndex(index);
        return elements[index];
        }
        public void clear(){
        size =0;
            System.out.println(Arrays.toString(elements) + " ");
            System.out.println("Deleted");
        }
        public int size(){
        return size;
        }
    }



