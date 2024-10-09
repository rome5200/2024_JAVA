package Chap3;

import java.util.Scanner;

public class Chap3_CheckInput {

	public static void main(String[] args) {
		// 올바른 입력 받기
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.print("올바른 월을 입력하세요[1~12] : ");
			month = sc.nextInt();
		}while(month < 1 || month > 12);
		System.out.printf("사용자가 입력한 월은 %d", month);

	}

}
