public class Same {
    public  static <T> boolean areEqual( T [] Array1, T [] Array2){
        if(Array1.length != Array2.length){
            return false;

        }
        for(int i =0; i<Array1.length;i++){
            if(Array1[i]!=Array2[i]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1,8,9,0};
        Integer[] intArray2 = {1,8,9,0};
        String [] stringArray1= {"m", "y", "p"};
        String [] stringArray2={"k","l","p"};
        System.out.println(areEqual(intArray1,intArray2));
    }

}
