package pyramid;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		
		String s = sc.next();
		char c = s.charAt(0);
		for (int i='a'; i<=c; i++) {
			for (int j = 'a'; j<=i; j++)
				System.out.print((char)j);
			System.out.println();
		}
	}

}
