package Jungol.Loop.Other;

import java.util.Scanner;

public class Loop4Other {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int total = 0;
    int count = 0;

    while (true){
      int num = sc.nextInt();
      if (num >= 100){
        total += num;
        count++;
        break;
      } else {
        total+= num;
        count++;
      }
    }

    double result = (double) total/count;
    System.out.println(total);
    System.out.printf("%.1f", result);

  }
}



