package javapractice.day20240618.jungol;
import java.util.Scanner;
//"몸무게+100-키" 비만 수치 공식
//키와 몸무게 자연수로 입력받아 -> 수치 잘보기
//첫째 줄에 비만수치를 출력하고
//비만수치가 0보다 크면
//다음줄에 비만이라는 메세지를 출력

public class Question2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    int weigh = sc.nextInt();

    int bmi = weigh + 100 - height;//수식을 직접 넣어도 좋지만, 선언하고, 변수명을 써서 간단하게~

    if(bmi > 0) {
        System.out.println(bmi);
        System.out.println("Obesity");
    }
    }
}
