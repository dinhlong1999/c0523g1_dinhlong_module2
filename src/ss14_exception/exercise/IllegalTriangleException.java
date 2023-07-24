package ss14_exception.exercise;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String str){
        super(str);
    }
}
