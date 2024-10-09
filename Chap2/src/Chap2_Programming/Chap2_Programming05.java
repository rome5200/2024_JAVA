package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming05 {

	public static void main(String[] args) {
		// 번개로부터 떨어진 거리 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간간격을 입력하시오(단위 : 초) : ");
		int sec = sc.nextInt();
		System.out.print("번개가 발생한 곳까지의 거리 : "+(sec*340)+"m");
	}

}
