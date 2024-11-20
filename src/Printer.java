public class Printer {
    public void print( int num){
        System.out.println("integer : " + num);
    }
    public  void   print(double num){
        System.out.println("double : " + num);
    }
    public void print(String text){
        System.out.println("string : "  + text);
    }
    public static void main(String[]args){
        Printer printer = new Printer();
        printer.print(10);
        printer.print(80.9);
        printer.print("madhu");
    }


}
