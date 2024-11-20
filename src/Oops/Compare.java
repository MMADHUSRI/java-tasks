package Oops;

public class Compare{
    int value;
    public Compare(int value){
        this.value=value;
    }
    public boolean Madhu(Compare compare){
        if(this.value==(compare.value)){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
      Compare compare1=new Compare(10);
       Compare compare2=new Compare(10);
      Compare compare3=new Compare(30);
        System.out.println(compare1.Madhu(compare2));
        System.out.println(compare1.Madhu(compare3));
    }
}
