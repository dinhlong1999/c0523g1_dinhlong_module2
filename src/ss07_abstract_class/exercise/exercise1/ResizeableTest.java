package ss07_abstract_class.exercise.exercise1;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(4);
        array[1] = new Rectangle(5, 7);
        array[2] = new Square(7);
        System.out.println("Pre-change: ");
        for (Shape shape : array) {
            System.out.println(shape.getArea());
        }
        Shape[] array1 = new Shape[3];
        array1[0] = new Circle(4);
        array1[1] = new Rectangle(5, 7);
        array1[2] = new Square(7);
        System.out.println("After change: ");
        for (Shape shape : array1) {
            shape.resize(0.1);
            System.out.println(shape.getArea());
        }
    }
}

