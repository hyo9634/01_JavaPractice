package Jungol.OutPut;

import java.util.Scanner;

//    세 개의 정수를 입력 받아서 합계와 평균을 출력하시오.
//    (단 평균은 소수 이하를 버리고 정수부분만 출력한다.
//    입력 : 10 25 33
//    sum : 68
//    avg : 22
public class Question1 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int a;
    int b;
    int c;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();

        System.out.println("sum : " + (a + b + c) );
        System.out.println("avg : " + (a + b + c)/3);
    }

}
