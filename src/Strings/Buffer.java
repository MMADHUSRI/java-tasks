package Strings;

public class Buffer {
    public static void main(String[] args) {
        String[] strings = { "Madhu", "Sandy"};
        StringBuffer stringBuffer= new StringBuffer();
        for (String str : strings){
            stringBuffer.append(str).append(" ");

        }
        String result = stringBuffer.toString().trim();
        System.out.println(result);
    }
}
