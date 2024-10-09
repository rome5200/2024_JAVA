package Chap3;

import java.util.Scanner;

public class Chap3_Nested {

	public static void main(String[] args) {
		// 정수 판별하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number > 0)
			System.out.println("양수입니다.");
		else if (number == 0)
			System.out.println("0입니다.");
		else
			System.out.println("음수입니다.");
	}

}
