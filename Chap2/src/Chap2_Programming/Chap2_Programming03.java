package Chap2_Programming;

import java.util.*;

public class Chap2_Programming03 {

	public static void main(String[] args) {
		// 연산자 연습하기
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("x : ");
		x = sc.nextInt();
		System.out.print("y : ");
		y = sc.nextInt();

		System.out.println("두 수의 합 : "+(x+y));
		System.out.println("두 수의 차 : "+(x-y));
		System.out.println("두 수의 곱 : "+(x*y));
		System.out.println("두 수의 평균 : "+((x+y)/2.0));
		System.out.println("큰 수 : "+(x>y?x:y));
		System.out.println("작은 수 : "+(x<y?x:y));
	}

}
