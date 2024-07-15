package Jungol.Loop.Self;
//아래와 같이 출력되는 프로그램을 작성하시오.
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8
//5 6 7 8 9
//6 7 8 9 10
public class Loop13 {

  public static void main(String[] args) {
    for(int i = 2 ; i <=6 ; i++){//행, 2부터 시작해서 6이 될때 까지 1이 증가하며 반복
      for(int j = i ; j <= i + 4 ; j++){//열, 행이 2~6번(i만큼) 돌 동안, j는 i값의+4가 될 떄 까지 1씩 증가한다.
        System.out.printf("%d " , j);//j를 정수의 형태로 출력
      }
      System.out.printf("\n");//행을 기준으로 줄바꿈

    }
  }

}
