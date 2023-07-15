package ss10_dsa.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;


public class MyList<E> {
    private int size;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[] = new Object[DEFAULT_CAPACITY];

    public MyList() {
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
        if (minCapacity >= 0) {
            int newElements = minCapacity + this.elements.length;
            elements = Arrays.copyOf(elements, newElements);
            System.out.println("New size change =" + newElements);
        } else {
            System.out.println("No valid");
        }
    }

    public void add(int index, E element) {
        if (index >= elements.length) {
            System.out.println("Array had full");
            Scanner scanner = new Scanner(System.in);
            System.out.println("input you want increase");
            int num = Integer.parseInt(scanner.nextLine());
            ensureCape(num);
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            System.out.println("Success");
            elements[index] = element;
            size++;
        } else {
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
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

    public E remove(int index) {
        checkIndex(index);
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[size - 1] = null;
        size--;
        return (E) Arrays.toString(elements);

    }

    public E clone() {
        Object newElement[] = new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            newElement[i] = elements[i];
        }
        return (E) Arrays.toString(newElement);
    }

    public boolean contains(Object objectContains) {
        for (int i = 0; i < size; i++) {
            if (objectContains.equals(elements[i])) {
                System.out.println("Array have element: " + objectContains);
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

    public E get(int index) {
        checkIndex(index);
        return (E) Arrays.toString(elements);
    }

    public void clear() {
        size = 0;
        System.out.println("Deleted");
    }

    public int size() {
        return size;
    }
}



