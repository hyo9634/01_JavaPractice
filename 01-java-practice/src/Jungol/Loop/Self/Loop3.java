package Jungol.Loop.Self;
//한 개의 정수를 입력받아
//양수(positive integer)인지 음수(negative number)인지 출력하는 작업을
//반복하다가
//0이 입력되면 종료하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Loop3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//입력받기

    while (true) {//무한 반복

      int a = sc.nextInt();//출력 뿐만 아니라 입력하는 것도 반복되어야 하기 때문에 while문 안에 와 있음
      if (0 < a) {//양수 일 경우
        System.out.println("양수");
      } else if (0 > a){//음수 일 경우
        System.out.println("음수");
      } else {//모두 해당하지 않는 경우
        break;//멈춤, 종료
      }

    }



  }
}
