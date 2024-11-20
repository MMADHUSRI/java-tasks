package Oops;

public class Calculator {
    public class Comparison{
        public boolean Equalto(int a , int b){
          return a==b;
        }
        public boolean Notequalto(int a, int b){
            return a != b;
        }
        public boolean Greaterthan(int a, int b){
            return a > b;
        }


    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Comparison comparison = calculator.new Comparison();
        System.out.println(comparison.Equalto(8,8));
        System.out.println(comparison.Notequalto(6,7));
        System.out.println(comparison.Greaterthan(6,3));
    }

}
