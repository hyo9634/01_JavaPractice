package Jungol.Loop.Self;
//자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
//3
//***
//**
//*
//*
//**
//***
import java.util.Scanner;

public class Loop17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      for(int j=n; j>=n-1; j--){
        System.out.print("*");
      }
//      for(int j=1; j<=i*2-1; j++){
//        System.out.print("*");
//      }
      System.out.println();
    }
  }
  }
