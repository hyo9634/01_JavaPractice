package Jungol.Loop.Other;

import java.util.Scanner;

public class Loop2other {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();// choice에 입력받을 정수 값을 저장
    int i = 1;//i값을 1로 초기화
    int sum = 0;//합계는 0부터 시작

    while (true) {
      if (choice > 0 && choice <= 100) {
        if (i > choice) {
          break;
        }
        sum += i;
        i++;
      } else {
        System.out.println("1~100 사이의 수만 입력해 주세요.");
      }
      System.out.println(sum);//합계를 출력
    }
  }
}