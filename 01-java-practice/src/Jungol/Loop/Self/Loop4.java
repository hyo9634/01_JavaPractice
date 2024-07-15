package Jungol.Loop.Self;
//정수를 계속 입력받다가(반복)
// 100이상의 수가 입력 되면 100 =< a
// 마지막 입력된 수를 포함 count로 마지막수의 개수 세기
// 합계와 평균 출력 sout total avg

import java.util.Scanner;

public class Loop4 {

  public static void main(String[] args) {//main 메서드로 실행

    Scanner sc = new Scanner(System.in);//입력받기

    int total = 0;//합계에 사용할 변수 선언,0으로 초기화
    int count = 0;//평균을 위해 나눌 변수 선언,0으로 초기화
    double avg = 0;//평균 변수 선언, 0으로 초기화

    while (true){//true를 입력하여 무한 반복(원하는 경우까지)

      int a = sc.nextInt();//스캐너로 입력받아 정수 사용, 반복해서 입력 받기 위해 while 반복문 안에 위치
      count++;//입력한 숫자의 개수가 1씩 증가
      total += a;//total = total + a한 값을 total에 저장
      if (a >= 100) {//100이상의 수가 입력될 경우, 라는 조건식 입력
        break;//멈춤
      } else {
      }

    }
    avg = (double) total / count;//casting 잊지말고 꼭 해주기
    System.out.println(total);
    System.out.printf("%.1f", avg);



  }
}
