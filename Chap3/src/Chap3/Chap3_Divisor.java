package Chap3;

import java.util.Scanner;

public class Chap3_Divisor {

	public static void main(String[] args) {
		// 약수 계산하기
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		System.out.printf("%d의 약수는 다음과 같습니다.\n", n);
		for(int i = 1; i <= n; ++i) { 
			if (n % i == 0)
				System.out.print(i + " ");
		}
	}

}
