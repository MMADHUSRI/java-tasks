package Strings;

import java.util.Arrays;

public class Anagram {
    public static boolean anagram(String str1, String str2){
        if(str1.length() != str2.length() ){
            return false;
        }
        //convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        //sort both arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        //compare sorted array
        return Arrays.equals(charArray1,charArray2);
    }

    public static void main(String[] args) {
       String  string1= "madhu";
        String string2 = "dhuma";
        boolean reult = anagram(string1,string2);
        System.out.println("two strings are anagrams : " + reult);
    }
}
