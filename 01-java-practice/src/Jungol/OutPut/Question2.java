package Jungol.OutPut;
// 정수 2개를 입력받아서
// 첫 번째 수에는 100을 증가시켜 저장하고
// 두 번째 수는 10으로 나눈 나머지를 저장한 후
// 두 수를 차례로 출력하는 프로그램을 작성하시오.
// 입력 : 20 35
// 출력 : 120 5

import java.util.Scanner;

public class Question2 {
    public static void main(String[] arges) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        a +=100;
        b %=10;

        System.out.println(a + " " + b);
    }
}
