package MorningTest.MorningTest;

import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextInt();

        System.out.println("합계 : " + (a + (int) b));
        System.out.println("평균 : " + ((double)a + b)/2);

    }
}
