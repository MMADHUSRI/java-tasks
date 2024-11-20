import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private  String name;
      public String getName(){
          return name;
      }
      public void setName(String name){
          this.name = name;
      }
      private  String rollnumber;

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }
    private String mailid;
     public  String getMailid(){
         return mailid;
     }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student();

            System.out.println("Enter The Student Name : ");
        String name = scan.nextLine();
        student.setName(name);

            System.out.println("Enter The roll.no : ");
            String rollnumber= scan.next();
            student.setRollnumber(rollnumber);


            System.out.println("Enter The Student Mailid :");
            String Mailid = scan.next();
            student.setMailid(Mailid);

            System.out.println("Enter The Student Address");
            String Address = scan.next();
            student.setAddress(Address);



        list.add(student);
        System.out.println(list);

        for(Student X: list){
            System.out.println("the Name is " + X.getName());
            System.out.println("the Rollnumber is " +X.getRollnumber());
            System.out.println("The Mailid is " + X.getMailid());
            System.out.println("The Address is " + X.getAddress());
        }

    }

}
