package Chap3;

import java.util.Scanner;

public class Chap3_Grading {

	public static void main(String[] args) {
		// 성적 처리
		int grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		grade = sc.nextInt();
		
		if(grade >= 90)
			System.out.println("A");
		else if (grade >= 80)
			System.out.println("B");
		else if (grade >= 70)
			System.out.println("C");
		else if (grade >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
