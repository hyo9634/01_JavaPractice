package ArrayHomeWork;
//매개변수로 받아 배열의 내용을
// 홀짝구분
// 홀수의 합과 짝수의 합을 출력하도록
// calc()메서드 내부 구현

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		Prob1 p = new Prob1();
		System.out.println("( 배열 ia )");
		p.calc(ia);
		System.out.println("( 배열 ib )");
		p.calc(ib);
	}
	
	public void calc(int[] ix) {
		int 홀수합 = 0;
		int 짝수합 = 0;

		// 구현하시오.-------------------------
		for (int i = 0; i < ix.length; i++) {
			if (ix[i] % 2 == 0) {
				짝수합 = 짝수합+ix[i];
			} else {
				홀수합 = 홀수합+ix[i];
			}
		}
		System.out.println("홀수의 합 : " + 홀수합);
		System.out.println("짝수의 합 : " + 짝수합);
	}

		//---------------------------------------
		
	}


