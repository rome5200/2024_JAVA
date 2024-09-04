package exponenetiation;

import java.util.Scanner;

public class exp {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int exp = 1;
		for (int i = 1; i <= y; i++)
			exp *= x;
		System.out.println("2의 5승 = " + exp);
		
		Scanner sc = new Scanner(System.in);
		int base, pow, expo = 1;
		
		System.out.print("밑을 입력하세요 : ");
		base = sc.nextInt();
		System.out.print("지수를 입력하세요 : ");
		pow = sc.nextInt();
		
		for(int i=1; i<=pow; i++)
			expo *= base;
		System.out.println(base + "의 " + pow + "승 = "+ exp);
	}
}
