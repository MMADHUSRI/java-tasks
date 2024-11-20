package Strings;

public class Reverse {


    public static String reverseString(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "madhu";
        String reversed= reverseString(input);
        System.out.println(reversed);
    }
}
