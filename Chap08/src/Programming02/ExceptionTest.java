package Programming02;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] token = s.split(" ");
		int sum = 0;
		try {
			for(var i : token) {
				sum += Integer.parseInt(i);
			}
			System.out.println("정수들의 합은 "+sum);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 예외 발생");
		}
	}

}
