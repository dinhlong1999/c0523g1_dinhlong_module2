package ss04_oop.exercise;

import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean status;
    double radius;
    String color;

    public Fan() {

        this.speed = SLOW;
        this.status = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public String toString() {
        if (getStatus()) {
            return "Speed fan: " + this.speed + "\nStatus: " + this.status + "\nRadius:" + this.radius + "\nColor = " + this.color + "\nFan is on";
        } else {
            return ".Radius:" + this.radius + "\nColor = " + this.color + "\nFan is off";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a speed:");
        int speed = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a status: ");
        boolean status = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter a radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a color: ");
        String color = scanner.nextLine();
        Fan fan = new Fan(speed, status, radius, color);
        System.out.println(fan.toString());
    }
}



