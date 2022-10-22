package HackerRank;

import java.util.Scanner;

public class Scanb {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number :");
        int  a = scan.nextInt();

        System.out.println("enter a second number :");
        int b = scan.nextInt();

        System.out.println("enter a third number : ");
        int c = scan.nextInt();

        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
