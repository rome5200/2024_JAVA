package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming10 {

	public static void main(String[] args) {
		// 움직이는 물체의 운동에너지 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물체의 무게를 입력하시오(kg) : ");
		int weight = sc.nextInt();
		System.out.print("물체의 속도를 입력하시오(m/s) : ");
		int speed = sc.nextInt();
		
		double energy = 0.5*weight*speed*speed;
		System.out.println("물체는 "+energy+"(줄)의 에너지를 가지고 있다.");
	}

}
