package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming06 {
	public static void main(String[] args) {
		// 번개로부터 떨어진 거리 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("드라이브 이름 : ");
		String driveName = sc.next();
		System.out.print("디렉터리 이름 : " );
		String directoryName = sc.next();
		System.out.print("파일 이름 : " );
		String fileName = sc.next();
		System.out.print("확장자 : " );
		String extensionName = sc.next();
		
		System.out.print("완전한 이름은 "+driveName+":"+directoryName+fileName+"."+extensionName);
	}

}
