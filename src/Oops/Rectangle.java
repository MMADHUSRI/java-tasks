package Oops;

public class Rectangle implements Shapes {
    private double length;
    private double width;
    public  Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

}
