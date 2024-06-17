package javapractice.day20240614;
//두 정수를 입력 받아서
//나눈 몫과 나머지를
//정해진 형식으로 출력
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();


        System.out.printf("%d / %d = %d...%d", a , b , a/b , a%b);

    }
}
