package ss05_acces_modifier.practice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car c1 = new Car("Mazda CX-5", "Sky_active 5");
        System.out.println(Car.numberOfCars);
        Car c2 = new Car("Mazda CX-8", "Sky_active 8");
        System.out.println(Car.numberOfCars);
    }
}
