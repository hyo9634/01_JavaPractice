package Jungol.Loop.Self;
//정수를 입력받아서
// 3의 배수가 아닌 경우, 아무 작업X
// 3의 배수인 경우에는 3으로 나눈 몫을 출력, 반복
//-1은 종료
//아무 조건도 없을 경우에는 조건문을 쓰지 않아도 된다. -> 실제적 조건은 2개
import java.util.Scanner;

public class Loop5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//입력받기

    int a;//변수 선언

    while (true) {//원하는 경우까지 반복

      a = sc.nextInt();//변수 a에 입력받는 정수 값 저장
      if(a%3 == 0){//3의 배수 검증, 3으로 나누었을 때 나머지가 0일 때
        System.out.println(a/3);//몫을 출력
      }else if(a == -1){//a의 값을 -1과 비교하여 -1과 같아질 경우
        break;//종료
      }

    }
  }



}
