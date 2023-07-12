package ss07_abstract_class.exercise.exercise2;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 8);
        shapes[2] = new Square(8);
        System.out.println("Area of shapes is: ");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}
