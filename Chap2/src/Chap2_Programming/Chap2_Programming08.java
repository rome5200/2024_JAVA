package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming08 {

	public static void main(String[] args) {
		// 구의 반지름을 입력받아서 부피를 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구의 반지름 :");
		double radius = sc.nextDouble();
		double pi = 3.141592;
		double volume = (4.0/3)*pi*(Math.pow(radius, 3));
		
		System.out.println("구의 부피 : "+volume);
	}

}
