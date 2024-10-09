package Chap3;

import java.util.Scanner;

public class Chap3_Averager {

	public static void main(String[] args) {
		// 점수 평균 구하기
		int total = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("점수를 입력하세요 : ");
			int grade = sc.nextInt();
			if (grade < 0)
				break;
			total += grade;
			count++;
		}
		System.out.println("평균은 "+total/count);
	}

}
