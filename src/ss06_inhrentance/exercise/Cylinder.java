package ss06_inhrentance.exercise;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return this.height * super.getArea();
    }


    @Override
    public String toString() {
        return "A Cylinder has height= " + getHeight() + "\nVolume of cylinder= " + volume() + ".\nwhich is subclass of " + super.toString();
    }

}

