package Jungol.OutPut;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if ((a > c) && (b > d)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}