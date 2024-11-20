package Emc;
//1. get input for variable mark if mark >35 print pass.else print fail
import java.util.Scanner;

public class Challenge {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int mad = scan.nextInt();
//        if (mad > 35) {
//            System.out.println("pass " + mad);
//
//        } else {
//            System.out.println("fail " + mad);
//        }
//    }

//    public static void main(String[] args) {


        // 2.get input for variable income if incomes is greater than 7000 scolorship is available else not eligible for scholorship
//        Scanner value = new Scanner(System.in);
//        int nag = value.nextInt();
//        if (nag > 7000) {
//            System.out.println("scolorship is available");
//        } else {
//            System.out.println("not eligible");
//        }
        //3.get input for a number and check whether it is divisible by both 3 and 5 or not if yes then print the number is divisible
        //by 3 and 5 print the  number is not divisible by 3 and 5;
//
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        if(num%3==0 && num%5==0){
//            System.out.println("the number is divisible by 3 and 5 " + num);
//        }
//        else {
//            System.out.println("the number is not divsible by 3 and 5 " + num);
//        }

//         //4.get input for a  number and find it is even or odd number
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        if(num%2==0){
//            System.out.println("the number is even " + num);
//        }
//        else {
//            System.out.println("the number is odd " + num);
//        }
        //5.what is the score in a game?
        //if the score is less than 50,print"you need to improved".if the score is between 50 and 70 (inclusive),print "good job".if the score is greater than 70,print "excellent performance".
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        if(num<50){
//            System.out.println("you need to improved");
//        } else if (num>=50&& num<=70) {
//            System.out.println("good job");
//
//        }
//        else{
//            System.out.println("excellent");
//        }
        //2.get input for five subject marks add all of it and find average .if average mark is less than 35.print"additinal classis requried" else print "you are good"
//        Scanner scan = new Scanner(System.in);
//         int s1= scan.nextInt();
//         int s2 = scan.nextInt();
//        int s3= scan.nextInt();
//        int s4= scan.nextInt();
//        int s5= scan.nextInt();
//        int total=s1+s2+s3+s4+s5;
//        int ave=total/5;
//        if(ave<35){
//            System.out.println("additinal class requried");
//        }
//        else {
//            System.out.println("you are good");
//        }
        //3.what is the colour of the traffic light?
        //if the answer is " red" print stop,"yellow" get ready,"green" go
//        Scanner scan = new Scanner(System.in);
//        String colour = scan.nextLine();
//        if(colour.equals("red")){
//            System.out.println("stop");
//        } else if (colour.equals("yellow")) {
//            System.out.println("get ready");
//
//        } else if (colour.equals("green")) {
//            System.out.println("go");
//
//        }
        //4.get input for salary and age if salary greater than or equal to 20000 or age less than or equal to 25
        //get input for required loan amount if not print you are not eligible for loan
        //if required loan amount is less than or equal to 50000 print you are eligible for loan .if is greater than 50000 print maximum loan amount is 50000.
//       Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your salary :");
//       int salary = scan.nextInt();
//        System.out.println("Enter your age :");
//       int age = scan.nextInt();
//
//       if(salary>=20000 || age<25){
//           System.out.println("get loan" );
//           System.out.println("Enter you loan amount :");
//           int loan = scan.nextInt();
//           if(loan<50000){
//               System.out.println("loan is available");
//           }
//           else{
//               System.out.println(" maximum loan amount is 50000 ");
//           }
//       }
//       else  {
//           System.out.println("not eligible for loan");
//
//       }
//part 3
        //1.get input for variable a and b and print the number from a to b


// Scanner scan = new Scanner(System.in);
//        System.out.println("number 1 : ");
//        int a = scan.nextInt();
//        System.out.println("number 2 : ");
//        int b = scan.nextInt();
//        for (int i = a;i<=b;i++){
//            System.out.println(i);
        //2.print even number between 1 to 10 using for loop and if elae
//        Scanner scan = new Scanner(System.in);
//
//        for (int  i =1;i<=10;i++){
//            if(i%2==0){
//                System.out.println("the even number is" + i);
//            }
//        }
        //3.print the odd count of the number
//        int Count=0;
//        for (int i = 1;i<=10;i++){
//            if(i%2!=0){
//
//                 Count++;
//
//                System.out.println(Count);
//            }
//        }
        //4.print the number which are divisible by both 3 and 5 range 1 to 100
//

 //       }
      //  part 3
        //1.get input for 5 numbers using array and for loop
//        int[] array = new int[5];
//        Scanner scan = new Scanner(System.in);
//        for (int i=0;i<=4;i++) {
//            array[i] = scan.nextInt();
//
//        }
////        System.out.println(array[0]);
////        System.out.println(array[1]);
////        System.out.println(array[2]);
////        System.out.println(array[3]);
////        System.out.println(array[4]);
//        for (int i = 0;i<=4;i++){
//            System.out.println(array[i]);
//        }

//        //2.print 10 numbers from an array using for loop
//        int [] name = new int[10];
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }
//        //3.print 2 table
//        for(int i =1; i<=10;i++){
//            System.out.println(i+"*2="+i*2);
////
////        }
//        for(int i=1;i<=10;i++){
//            System.out.println(i+"*6="+i*6);
//        }
//        Scanner sacn = new Scanner(System.in);
//        int table = sacn.nextInt();
//        for (int i =1;i<=10;i++){
//
//            System.out.println(i+"*"+table+"="+table*i);
//        }
        //4.get input for size on array
        //get input for each element in an array
        //find and print middle element in an array
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int [] mark=new int[size];
//        for (int i=0;i<=size; i++){
//            mark[i]= scan.nextInt();
//
//        }
        //part 4
        //1.create a class called find with main function
        //create a function called even or odd with integer parameter called int num
        //inside main function get integer input from user
        //pass that input to even or odd function let the function decide whether the number is even or odd
//      void evenorodd(int num){
//
//
//          if(num%2==0){
//              System.out.println("even number");
//          }
//          else {
//              System.out.println("odd number");
//          }
//
//      }
//    public static void main(String[] args) {
//
//          Challenge obj1= new Challenge();
//        Scanner scan= new Scanner(System.in);
//        int number= scan.nextInt();
//
//
//        obj1.evenorodd(number);
//
//
//    }
//
    //2.create a class called "school " with main function
    //create a function called passorfail which should return the string "pass/fail"
    //inside main function get integer input from user for total mark
    //pass that input to the passorfail function and let the function decide whether student is  passorfail
      String passorfail(int score ){
          if(score<35){
              return "fail";
          }
          else {
              return "pass";
          }

     }
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int totalrank= scan.nextInt();
          Challenge obj1=new Challenge();
          String result=obj1.passorfail(totalrank);
        System.out.println(result);

}


    }




