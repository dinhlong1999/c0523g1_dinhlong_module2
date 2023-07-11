package ss06_inhrentance.exercise;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        System.out.println();
        movablePoint = new MovablePoint(2, 4);
        System.out.println(movablePoint);
        System.out.println();
        movablePoint = new MovablePoint(2, 4, 5, 7);
        System.out.println(movablePoint);
        System.out.println();
        System.out.println(movablePoint.move());
    }
}
