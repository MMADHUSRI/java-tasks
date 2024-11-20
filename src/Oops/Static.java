package Oops;

public class Static {
    static int count = 6;
    static void incrrementCount(){
        count++;
    }
    static class staticinner{
        static void display(){
            System.out.println("hello static inner class!");
        }
    }

    public static void main(String[] args) {
        incrrementCount();
        incrrementCount();
        System.out.println(count);
        staticinner.display();
    }
}
