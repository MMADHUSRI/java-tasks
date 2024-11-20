public class Sum {
   public static int array(int [] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }
    public static void main(String[]args){
        int[]number = {8,9,7,5,4,3};
        int result = array(number);
        System.out.println(result);
    }
}
