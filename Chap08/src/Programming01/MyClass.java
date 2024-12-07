package Programming01;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 문자열 입력받기
		System.out.print("문자열을 입력하시오: ");
		String s = sc.nextLine(); // 전체 라인을 입력받음

		String[] tokens = s.split(" ");

		System.out.println("\n분리된 단어:");
		for (String token : tokens) {
			System.out.println(token);
		}

		System.out.println("\n단어 개수: " + tokens.length);
	}
}
