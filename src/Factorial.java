import java.util.Arrays;

public class Factorial {
    public static int factorial(int n){
    if(n==0){
        return 1;
    }
    return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int factorial=1;
        int number=8;
        factorial=factorial(number);
        System.out.println("Factorial number " + number + " is " + factorial);
    }
}
