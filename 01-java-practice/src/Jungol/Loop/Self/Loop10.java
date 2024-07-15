package Jungol.Loop.Self;
//100 이하의 정수를 입력받아서
//입력받은 정수부터
//100까지의 합을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Loop10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();//입력받은 값을 a에 넣겠다
    int sum = 0;//변수 초기화, 값을 가공해서 쓸려면 초기화, 나중 대입할거면 초기화 안해도 되는데
    for(int i = a ; i <= 100 ; i++){//i는 입력받은 a부터 100까지 i씩 증가하며
      sum +=i;//sum = sum+i
    }
    System.out.println(sum);
  }

}
