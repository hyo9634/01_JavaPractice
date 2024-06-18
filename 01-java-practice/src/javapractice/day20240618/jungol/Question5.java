package javapractice.day20240618.jungol;

import java.util.Scanner;

//두 개의 실수 모두 입력 받아
//4.3 3.5
//4.0 2.9
//모두 4.0 이상이면 "A"
//모두 3.0 이상이면 "B"
//아니면 "C"
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double score1= sc.nextDouble();
        double score2= sc.nextDouble();

        String grade;

        if (score1 >= 4.0 && score2>=4.0) {
            grade = "A";

        } else if (score1 >= 3.0 && score2>=3.0){
            grade = "B";

        } else {
            grade = "C";
        }

        System.out.println(grade);



    }
}
