package Emc;

import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        Scanner mad = new Scanner(System.in);
        int a = mad.nextInt();
        int b = mad.nextInt();
        int c = mad.nextInt();
        int d =a*b*c;
        int e = a+b+c;

        System.out.println(d/e);
    }
}
