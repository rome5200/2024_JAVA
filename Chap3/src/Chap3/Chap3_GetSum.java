package Chap3;

import java.util.Scanner;

public class Chap3_GetSum {

	public static void main(String[] args) {
		// 합계 계산하기
		Scanner sc = new Scanner(System.in);
		int sum = 0, value = 0;
		
		while (value != -1) {
			sum += value;
			System.out.print("정수를 입력하세요 : ");
			value = sc.nextInt();
		}
		System.out.printf("정수의 합은 %d입니다.\n", sum);
	}

}
