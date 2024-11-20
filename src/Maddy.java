import java.util.Arrays;

public class Maddy {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
    public static int multiplication (int a, int b){
        return a*b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        Maddy maddy=new Maddy();
       System.out.println("integer addition "+ maddy.add(3,4));
        System.out.println("integer subraction "+ maddy.sub(3,4));
        System.out.println("integer multiplication " + maddy.multiplication(3,4));
        System.out.println("double addition " + maddy.add(3.4,1.1));
        System.out.println("double subraction " + maddy.sub(3.4,1.1));
        System.out.println("double multiplication " + maddy.multiplication(3.4,1.1));
    }
}
