package javapractice.day20240613;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        int c = a++ * --b; // a=10(다음에 호출 될 때 +1 예정), b=19(지금 당장 -1)

        System.out.print(a + // a=11 (후치 증가연산으로 인해 이번 호출 부터 1 증가)
                " " + b + " " + c);
    }

}
