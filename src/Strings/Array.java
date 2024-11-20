package Strings;

public class Array {
    public static void main(String[] args) {
        String[] strings = {"madhu","sandy","keerthi","harish","hariprasth"};
        StringBuilder stringBuilder = new StringBuilder();
       //iterates over each element in the strings array
        for (String str : strings){
            // each string from array is appended to stringbulider
            stringBuilder.append(str).append( " ");
        }
        // the content of string builder is converted to a string using to string
        // trim is use to remove the extra trailing space
        String result = stringBuilder.toString().trim();
        System.out.println(result);
    }
}
