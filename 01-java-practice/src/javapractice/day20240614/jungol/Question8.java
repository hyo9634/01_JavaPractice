package javapractice.day20240614.jungol;

//직사각형 가로와 세로의 길이를 정수형 값으로 입력받은 후
//가로길이는 5증가
//세로 길이는 2배 하여 저장
//가로,세로, 넓이를 차례로 출력하는 프로그램 작성

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scanner 객체생성

        int a = scan.nextInt();
        int b = scan.nextInt();

        a +=5;
        b *=2;
        int c = a*b;

        System.out.println("width = " + a);
        System.out.println("length = " + b);
        System.out.println("area = " + c);

    }
}
