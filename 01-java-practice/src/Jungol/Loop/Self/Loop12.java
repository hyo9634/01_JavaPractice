package Jungol.Loop.Self;

import java.util.Scanner;

//10 이하의 과목수 n이 주어진다.
//정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고  int double 평균=합계/과목수->casting하기
//평균이 80점이상이면 "pass", avg >= 80
// 80점 미만이면 "fail" avg < 80
// 이라고 출력하는 프로그램을 작성하시오.
//평균은 반올림하여 소수 첫째자리까지 출력한다.​ 1%f
// 입: 4
//75 80 85 90
//출 : avg : 82.5
//pass
public class Loop12 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int score = 0;
    int total = 0;
    double avg = 0;


    for(int i = 0 ; i < n ; i++){
      score = sc.nextInt();
      total +=score; // 누적 합연산이면 +=를 생각해보자
//    total = total + score;
//      0 += 75 / total = 0 + 75;
//      75 += 80 / total = 75 + 80;
//      155 += 85 / total = 155 + 85;
//      240 += 90 / toal = 140 + 90;

//      330/ 4 82.5
    }

    avg = (double) total/n;

    System.out.printf("avg : %.1f\n", avg);

    if(avg >= 80){
      System.out.println("pass");
    } else {
      System.out.println("fail");
    }

  }

}
