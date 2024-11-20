package Emc;

import java.util.Scanner;

public class Dead {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String mag=scan.nextLine();
        if(mag.equals("dead")){
            System.out.println("Surya meets Ramya");
        }
        else {
            System.out.println("Surya weds Megana");
        }
    }
}
