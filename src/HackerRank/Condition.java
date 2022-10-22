package HackerRank;

import java.util.Scanner;

public class Condition {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        scan.skip("(/r/n|/N/R/U2028/u2029/u0085])?");

        scan.close();

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N % 2 == 0) {
            if (N > 20) {
                System.out.println("Not Weird");
            } else if (N <= 20 && N > 6) {
                System.out.println("Weird");
            } else if (N < 5 && N > 2) {
                System.out.println("Not Weird");
            }
        }
    }
}
