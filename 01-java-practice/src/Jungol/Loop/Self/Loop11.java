package Jungol.Loop.Self;

import java.util.Scanner;

//10개의 정수를 입력받아
// 3의 배수의 개수와 5의 배수의 개수를
// 각각 출력하는 프로그램을 작성하시오.
public class Loop11 {

  public static void main(String[] args) {
    int a = 0;
    int three = 0;
    int five = 0;
    Scanner sc = new Scanner(System.in);
    for(int i = 0 ; i <= 9 ; i++) {
      a = sc.nextInt();
      if (a % 3 == 0) {
        three++;
      }
      if (a % 5 == 0) {//똑같은 대상으로 여러 조건을 검증할 때는 if문을 여러번 사용하면 좋다.
        five++;
      }
    }
    System.out.println("Multiples of 3 : " + three);
    System.out.println("Multiples of 5 : " + five);
  }

}
