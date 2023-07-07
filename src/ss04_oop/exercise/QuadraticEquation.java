package ss04_oop.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
     double getDiscriminant() {
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return delta;
    }
    double getRoot() {
        double r = (-this.b / (2 * this.a));
        return r;
    }
    double getRoot1() {
        double r1 = (-this.b + Math.pow(this.getDiscriminant(),0.5) / (2 * this.a));
        return r1;
    }
    double getRoot2() {
        double r2 = (-this.b - Math.pow(this.getDiscriminant(),0.5) / (2 * this.a));
        return r2;
    }


}
