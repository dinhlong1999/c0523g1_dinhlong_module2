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
        double delta = (getB() * getB()) - (4 * getA() * getC());
        return delta;
    }
    double getRoot() {
        double r = (-getB() / (2 * getA()));
        return r;
    }
    double getRoot1() {
        double r1 = (-getB() + Math.pow(this.getDiscriminant(),0.5) / (2 * getA()));
        return r1;
    }
    double getRoot2() {
        double r2 = (-getB() - Math.pow(this.getDiscriminant(),0.5) / (2 * getA()));
        return r2;
    }


}
