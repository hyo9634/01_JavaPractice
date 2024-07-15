package ArrayHomeWork;

import java.util.ArrayList;
import java.util.List;

public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		// 구현하세요.
		List<Integer> list = new ArrayList<>();
		for(int i:array){
			int a=0;
			for(int j:array) {
				if(i==j){
					a++;
				}
			}
			if (a==1) {
				list.add(i);
			}
		}
		System.out.println(list.toString());
	}
}
