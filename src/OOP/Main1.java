package OOP;

public class Main1 {
    public static void main(String[] args){
        Circle circle=new Circle(5.0);
        Rectangle rectangle= new Rectangle(4.0,6.0);
        double circleArea=circle.calculateArea();
        double rectangleArea=rectangle.calculateArea();

        System.out.println("Circle area:"+circleArea);
        System.out.println("Rectangle rea:"+rectangleArea);
    }
}
