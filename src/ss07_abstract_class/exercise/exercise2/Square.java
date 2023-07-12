package ss07_abstract_class.exercise.exercise2;

public class Square extends Shape implements Colorable{
    private double side ;
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



    @Override
    public String toString() {
        return "A Square with side=" +
                getSide() + ",which is a subclass of " + super.toString();

    }
    public  double getArea(){
        return this.side * 4;
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides. ");
    }
}
