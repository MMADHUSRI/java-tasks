public class Circle {
    static double circle( double radius){
        double area=Math.PI*(radius*radius);
        return area;
    }
    static double cir(double radius){
        double circumference=2*Math.PI*radius;
        return circumference;
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        double area=circle(9);
        double circumference=cir(9);
        System.out.println(area);
        System.out.println(circumference);
    }
}
