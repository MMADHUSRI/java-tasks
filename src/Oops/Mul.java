package Oops;

public class Mul {
    int number;
    String text;
    public Mul(){
        this.number = 0;
        this.text= "default";
    }
    public Mul(int number){
        this.number=number;
        this.text="default";

    }
    public Mul(int number,String text){
        this.number=number;
        this.text=text;
    }
     public String Details(){
        return "number " + number + " text " + text;
     }
    public static void main(String[] args) {
        Mul mul1 = new Mul();
        Mul mul2 = new Mul(21);
        Mul mul3 = new Mul(21,"madhu");
        System.out.println(mul1.Details());
        System.out.println(mul2.Details());
        System.out.println(mul3.Details());
     }
}
