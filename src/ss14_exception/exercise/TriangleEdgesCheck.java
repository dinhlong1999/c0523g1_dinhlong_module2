package ss14_exception.exercise;

public class TriangleEdgesCheck  {
  public void triangleEdgesCheck(double a, double b, double c) throws IllegalTriangleException{
      if (a < 0 || b < 0 || c < 0 || ((a+ b) < c) || ((a+c) < b) || ((b + c) < a)){
          throw new IllegalTriangleException("Error: Triangle no valid");
      }else {
          System.out.println("Triangle valid");
      }
  }
}
