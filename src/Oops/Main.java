package Oops;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(2,5);
        Circle circle=new Circle(6);
        Triangle triangle=new Triangle(8,6);
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
    }
}
