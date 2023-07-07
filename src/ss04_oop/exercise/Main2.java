package ss04_oop.exercise;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter press to start.");
        String startTime = scanner.nextLine();
        stopWatch.start();
        System.out.println("Enter press to stop.");
        String endTime = scanner.nextLine();
        stopWatch.stop();
        System.out.println("Time has passed: " + stopWatch.getElapsedTime() + " milisecond second");

    }
}
