package javapractice.day20240613;

import java.util.Scanner;

// 한 개의 정수를 입력 받아서
// 후치증가 연산자를 사용하여 출력한 후
// 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.
// 입력 : 5
// 출력 : 5 -> 7
public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.println(a++);
        System.out.println(++a);

    }
}
