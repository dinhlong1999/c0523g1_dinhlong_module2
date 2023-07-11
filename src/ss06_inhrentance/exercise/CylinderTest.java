package ss06_inhrentance.exercise;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.4);
        System.out.println(cylinder);
        System.out.println();
        cylinder = new Cylinder(5.4, 3.4, "Blue");
        System.out.println(cylinder);
        System.out.println();
        cylinder = new Cylinder();
        System.out.println(cylinder);
    }
}
