package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming09 {
	
	public static void main(String[] args) {
		// 구의 반지름을 입력받아서 부피를 출력하기
		Scanner sc = new Scanner(System.in);
		
		char[] bit = new char[8];
		
		System.out.print("정수 :");
		int integer = sc.nextInt();
		int beforeInteger = integer;
		bit[0] = '0'; 
		bit[1] = '0';
		bit[2] = '0';
		bit[3] = '0';
		bit[4] = '0';
		bit[5] = '0';
		bit[6] = '0';
		bit[7] = '0';
		
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[0] = '1';
			integer /= 2;
		}
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[1] = '1';
			integer /= 2;
		}
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[2] = '1';
			integer /= 2;
		}
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[3] = '1';
			integer /= 2;
		}
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[4] = '1';
			integer /= 2;
		}
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[5] = '1';
			integer /= 2;
		}
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[6] = '1';
			integer /= 2;
		}
		if (integer >= 1) {
			if(integer % 2 == 1)
				bit[7] = '1';
			integer /= 2;
		}
		System.out.println(beforeInteger+" : "+bit[7]+bit[6]+bit[5]+bit[4]+bit[3]+bit[2]+bit[1]+bit[0]);
		
		if (integer < 0) {
			System.out.println("음수는 변환이 불가능합니다.");
		}
		
	}
}
