package Jungol.Loop.Self;
//하나의 정수를 입력받아
// 1부터 입력받은 정수까지의
// 짝수를 차례대로 출력하는 프로그램을 작성하시오.
// 입력되는 정수는 50이하이다.

import java.util.Scanner;

public class Loop9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//입력받기
    int a = sc.nextInt();//정수 a에 입력받은 값을 대입

    for(int i = 1 ; i <= a ; i++){//1부터 입력받은 정수(a)까지 1씩 증가하며
      if(i % 2 == 0){//짝수 산출, 짝수는 2로 나누었을 때 나머지가 0
        System.out.print(i + " ");//i가 늘어나는 값, 차례대로 출력
      }
    }
  }

}
