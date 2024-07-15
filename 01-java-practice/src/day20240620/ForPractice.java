package day20240620;

public class ForPractice {

  public static void main(String[] args) {

    for(int a = 1 ; a <= 9 ; a++){//a는 1으로 시작하여, 9까지, 1씩 증가하며 반복됨  0 1 2 3 4 1단부터 9단까지
      for(int b = 1 ; b <= 9 ; b++){//b는 0으로 시작, 9까지 , 1씩 증가하며 반복   0 1 2 3 4 5 6 7 8 9 곱하는 값
        System.out.println(a + " * " + b + " = " + (a*b));//
      }
    }
  }
}
