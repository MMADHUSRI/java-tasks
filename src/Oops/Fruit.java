package Oops;

public class Fruit {
    public enum allFruit{
        APPLE,
        ORANGE,
        GRAPES,

    }

    public static void main(String[] args) {
        allFruit fruit=allFruit.APPLE;
        allFruit fruit1=allFruit.GRAPES;
        System.out.println("selected fruit " + fruit1);
    }

}
