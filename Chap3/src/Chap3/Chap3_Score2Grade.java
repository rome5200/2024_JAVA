package Chap3;

import java.util.Scanner;

public class Chap3_Score2Grade {

	public static void main(String[] args) {
		// switch 함수를 사용하여 성적 변환하기
		int score, number;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		score = sc.nextInt();
		number = score/10;
		switch(number){
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
		}
		System.out.println("학점 : "+grade);

	}

}
