package Chap2;

import java.util.Scanner;

public class Chap2_CalTime {

	public static void main(String[] args) {
		// 초 단위의 시간을 받아서 몇 분 몇 초인지 계찬하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하세요 : ");
		int time = sc.nextInt();
		int sec = (time%60);
		int min = (time/60);
		
		System.out.println(time+"초는 "+min+"분 "+sec+"초입니다.");
	}

}
