package Jungol.Loop.Self;
//나라이름을 출력 숫자를 입력받아
// 해당하는 나라의 수도 출력-반복
// 해당하는 번호 이외의 숫자가 입력되면 "none"출력후 종료

import java.util.Scanner;

public class Loop6 {

//"""=쌍따옴표 3개는 문자열을 입력할 경우 입력한 그대로 출력된다.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//입력받기
    while (true) {//멈출 때 까지 무한 반복
      System.out.print("""
          1. Korea
          2. USA
          3. Japan
          4. China
          number?\s""");//s 띄어쓰기
//      System.out.print("number? ");
      int country = sc.nextInt();//country에 정수값 저장
    switch (country) {
      case 1:
        System.out.println("\nSeoul\n");
        break;
      case 2:
        System.out.println("\nWashington\n");
        break;
      case 3:
        System.out.println("\nTokyo\n");
        break;
      case 4:
        System.out.println("\nBeijing\n");
        break;//가장 가까운 반복문 안에서 탈출
      default:
        System.out.println("\nnone\n");
        return;//현재 매서드 즉시 종료
        //while문 안에 반복문이 있을 때는 return을 해주어야 종료된다.(보통 즉시 종료)
    }
    }
  }

}
