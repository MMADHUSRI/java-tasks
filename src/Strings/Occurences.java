package Strings;

public class Occurences {
    public static int countoccurence(String str,char ch){
        int  count = 0;

//        for (int i = 0; i< str.length();i++){
//           //retrive the character at the current index.if it matches ch,count is increment
//            if(str.charAt(i)==ch){
//                count++;
//
//            }
//        }
//        return count;
        char[] mad = str.toCharArray();
        for (char c:mad){
            if (c==ch) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'l';
        int result = countoccurence(str,ch);
        System.out.println("chacter " + ch + " string " + result + " times" );

    }

}
