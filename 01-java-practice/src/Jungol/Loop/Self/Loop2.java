package Jungol.Loop.Self;

import java.util.Scanner;

public class Loop2 {

  //100이하의 양의 정수만 입력
  //while문으로
  //1부터 입력받은 정수까지 합을 구하여 출력
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();// choice에 입력받을 정수 값을 저장
    int i = 1;//i값을 1로 초기화
    int sum = 0;//합계는 0부터 시작
    while (i <= choice) {//입력 받을 정수 값이 i보다 작거나 같아야함 (100이하)
      sum += i;//sum = sum+i (sum = 0+1, sum이 1일 경우, 3 = 1+2...
      i++;//1값을 1씩 증가시키며
    }

    System.out.println(sum);//합계를 출력




  }
}
