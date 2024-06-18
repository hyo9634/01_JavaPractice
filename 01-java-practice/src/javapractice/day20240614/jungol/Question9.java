package javapractice.day20240614.jungol;

//두 정수를 입력받아 10 15
//첫 번째 수는 전치증가연산자 사용
//두 번째 수는 후치감소연산자를 사용하여 출력
//바뀐 값을 다시 출력

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.print(++a);
        System.out.println(" " + b--);
        System.out.print(a);
        System.out.print(" " + b--);



    }
    }

