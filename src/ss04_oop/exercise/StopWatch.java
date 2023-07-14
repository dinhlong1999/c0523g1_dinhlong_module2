package ss04_oop.exercise;

import java.util.Date;

public class StopWatch {
     double startTime;
     double endTime;
    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    StopWatch() {
       this.startTime = System.currentTimeMillis();
    }
    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    void start() {
        Date date1 = new Date();
        int hours = date1.getHours();
        int minute = date1.getMinutes();
        int second = date1.getSeconds();
        this.startTime = System.currentTimeMillis();
        System.out.println("Current is : " + hours + "h" + minute + "p" + second + "s");
    }

    void stop() {
        Date date2 = new Date();
        int hours = date2.getHours();
        int minute = date2.getMinutes();
        int second = date2.getSeconds();
        this.startTime = System.currentTimeMillis();
        System.out.println("Time stop: " + hours + "h" + minute + "p" + second + "s");
    }

    double getElapsedTime() {
        double sum = this.startTime - this.endTime;
        return sum;
    }
}
