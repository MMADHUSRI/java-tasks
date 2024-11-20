package Strings;

public class Palindrome {
    public static boolean palindrom(String str ){
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String result= String.valueOf(palindrom("amma"));
        System.out.println(result);
    }
}
