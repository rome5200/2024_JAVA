package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming02 {

	public static void main(String[] args) {
		// 마일을 킬로미터로 변환하기
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하세요 : ");
		double mile = sc.nextDouble();
		System.out.print(mile+"마일은 "+(mile*1.609)+"킬로미터 입니다.");
	}

}
