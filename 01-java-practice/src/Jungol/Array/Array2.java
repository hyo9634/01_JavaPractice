package Jungol.Array;
//정수 10개를 저장할 수 있는 배열을 만들어서
// 1부터 10까지 대입하고
// 차례대로 출력하는 프로그램

public class Array2 {

  public static void main(String[] args) {
    int [] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for(int i = 0 ; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
