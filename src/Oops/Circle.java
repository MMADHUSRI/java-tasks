package Oops;

public class Circle implements Shapes{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius;
    }
}
