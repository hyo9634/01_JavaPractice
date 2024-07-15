package Jungol.OutPut;

import java.util.Scanner;

//남자 M, 여자 F, 18세 성인
//성별, 나이 입력받아
//"MAN", "WOMAN", "BOY", "GIRL"
public class Question14 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String gender = sc.next();
        int age = sc.nextInt();

        if(age >= 18 && gender.equals("M")) {
            //== 비교 연산자는 String만 쓸 수 없다.(Char는 사용 가능)->char는 기본타입 아스키코드이기 떄문에 기본 연산자로 비교
            System.out.println("MAN");
        } else if (age < 18 && gender.equals("M")) {
            System.out.println("BOY");
        } else if (age >= 18 && gender.equals("F")) {
            System.out.println("WOMAN");
        } else {
            System.out.println("GIRL");
        }
    }
}
