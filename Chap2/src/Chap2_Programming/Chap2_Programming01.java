package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming01 {

	public static void main(String[] args) {
		// 오렌지 개수에 따라 상자 개수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("오렌지의 개수를 입력하세요 : ");
		int Oranges_num = sc.nextInt();
		System.out.println((Oranges_num/10)+"박스가 필요하고 "+(Oranges_num%10)+"개가 남습니다.");
	}

}
