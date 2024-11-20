import java.util.Arrays;

public class FibanociCalculator {
    public static int fibanoci(int n){
        if(n<=1){
            return n;
        }
        return fibanoci(n-1)+fibanoci(n-2);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println( "Fibanoci at position "  + n + " is " + fibanoci(n));
    }
}
