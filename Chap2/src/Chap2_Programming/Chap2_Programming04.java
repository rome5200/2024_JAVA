package Chap2_Programming;

public class Chap2_Programming04 {

	public static void main(String[] args) {
		// 논리연산자 연습
		int p = 3;
		int q = 3;
		
		boolean result1;
		boolean result2;
		boolean result3;
		boolean result4;
		
		result1 = (p == 3) && (p != 4);
		result2 = (p == q) || (p != q);
		result3 = !(p == 3);
		result4 = (p == 3) ^ (p == q);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
