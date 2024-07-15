package Jungol.OutPut;

import java.util.Scanner;

//정수를 입력받아
//첫 줄에 입력 받은 숫자 출력
//둘째 줄에 음수이면 "minus"라고 출력
public class Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(num);

        int a = -5;
        if(a < 0)
            System.out.println("minus");
    }
}
