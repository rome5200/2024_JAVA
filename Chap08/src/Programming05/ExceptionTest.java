package Programming05;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int[] c = new int[26]; // 알파벳 발생 횟수를 저장하는 배열
		Scanner sc = new Scanner(System.in);

		System.out.println("단어를 입력하세요:");
		String token = sc.nextLine().toUpperCase(); // 입력을 모두 대문자로 변환

		for (int i = 0; i < token.length(); i++) {
			try {
				char ch = token.charAt(i); // 각 문자를 가져옴
				int index = ch - 'A'; // 알파벳의 배열 인덱스 계산
				c[index]++; // 해당 인덱스 값 증가
			} catch (ArrayIndexOutOfBoundsException e) {
				// 알파벳 외의 문자가 입력된 경우 처리
				System.out.println("알파벳이 아닌 문자 발견: " + token.charAt(i));
			}
		}

		// 알파벳 발생 횟수 출력
		System.out.println("\n알파벳 발생 횟수:");
		for (int i = 0; i < 26; i++) {
			System.out.println((char) ('A' + i) + " : " + c[i]);
		}
	}
}
