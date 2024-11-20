public class Occurr {
    public static void main(String[]args){
        int array [] = {4,9,8,8,7,6,7,5,7,9};
        int count = 0;
        for(int i : array){
            if(i == 7)
                count ++;

        }
        System.out.println(count);

    }
}
