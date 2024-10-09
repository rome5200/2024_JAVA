package Chap3;

import java.util.Scanner;

public class Chap3_EvenOdd {

	public static void main(String[] args) {
		// 짝수와 홀수 구별하기
		int number;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		number = sc.nextInt();
		
		if(number % 2 == 0)
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
	}

}
