package Jungol.Array;
//10개의 문자를 입력 받아서
//첫번째 네번째 일곱번째 입력받은 문자를 차례로 출력

import java.util.Scanner;

public class Array3 {
//10개의 문자를 입력받아서
// 첫 번째 네 번째 일곱 번째 입력받은 문자를
// 차례로 출력하는 프로그램을 작성하시오.
  public static void main(String[] args) {

    /*int[] arr2 = new int[2];
    arr2[0]= 1;
    arr2[1]= 2;*/


    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    /*arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();
    arr[2] = sc.nextInt();
    arr[3] = sc.nextInt();*/



    for(int i =0 ; i < 10 ; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(arr[0] + " " + arr[3] + " " + arr[6]);


  }

}
