import java.util.Scanner;

//package Emc;
//
//import java.util.Scanner;
//
public class Mad {
//    public static void main(String[] args) {
////        System.out.println(5>7);
//        int num1 = 20;
//        int num2 = 70;
////        if(num1>num2){
//            System.out.println("the number is greater " );
//        }
//        else {
//            System.out.println("the number is lessthen");
//        }
    //check whether number 1 and number 2 is equal or not
//        if(num1==num2){
//            System.out.println("both the numbers are equal");
//        }
//        else{
//            System.out.println("the numbers are not equal");
//        }
//        Scanner mad=new Scanner(System.in);
//        int nam= mad.nextInt();
//        int nma=mad.nextInt();
//        if(nam==nma) {
//            System.out.println("numbers are same");
//        }
//        else {
//            System.out.println("not same");
//        }
//        String a = " one";
//        String b = new String(" one");
//        String c = b;
//        System.out.println(a==c);
//        System.out.println(a.equals(c));
//      boolean hungry = true;
//      boolean icecream = false;
//      if(hungry||icecream){
//          System.out.println(".....");
//      }
//      Scanner scan = new Scanner(System.in);
//      int name = scan.nextInt();
//      int ame= scan.nextInt();
//      String result = name>ame?"name is greater":" ame is greater ";
//        System.out.println(result);
//}

    //        for(int i = 10;i>=1;i--){
//            System.out.println(i);
//        }
    //create an integer array get input for 5 numbers and print their sum or total
//        int[] score = new int[5];
//        Scanner scn = new Scanner(System.in);
//        score [0]=scn.nextInt();
//        score [1]=scn.nextInt();
//       score [2]=scn.nextInt();
//        score [3]=scn.nextInt();
//        score [4]=scn.nextInt();
//        System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= i; j++) {
//
//                    System.out.print("* ");
//
//
//            }
//            System.out.println();
//        }
//        Scanner scan = new Scanner(System.in);
//        int a = 0;
//        do {
//            System.out.println("Enter the number > 10 ");
//            a= scan.nextInt();
//
//
////        }
////        while (a<10);
//
//
//
//    }
//}
    //function
//    void  iphone(){
//        System.out.println("This is iphone");
//        samsung();
//        poco();
//        redmi();
//
//    }
//    void  samsung(){
//        System.out.println("this is samsung");
//    }
//    void  poco(){
//        System.out.println("this is poco");
//    }
//    void redmi(){
//        System.out.println("this is redmi");
//    }
//    public static void main(String[] args) {
//        Mad obj1= new Mad();
//        obj1.iphone();
//
//    }
//    int appleprice=20;
//    int applecount=5;
//    void garden(){
//        System.out.println(appleprice*applecount);
//    }
//
//    public static void main(String[] args) {
//        Mad obj1= new Mad();
//        obj1.garden();
//    }
//    int sum(int a ,int b){
//        int m=a +b;
//      return m;
//
//    }
//
//    public static void main(String[] args) {
//        Mad obj1=new Mad();
//       int total =  obj1.sum(2,7);
//        System.out.println(total);
//
//    }
    String getname(){
        Scanner scan = new Scanner(System.in);
        String mad=scan.nextLine();
        return mad;


    }
    public static void main(String[] args) {
        Mad obj1=new Mad();
        String mad = obj1.getname();
        System.out.println(mad);

    }
}