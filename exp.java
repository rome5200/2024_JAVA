package exponenetiation;

import java.util.Scanner;

public class exp {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int exp = 1;
		for (int i = 1; i <= y; i++)
			exp *= x;
		System.out.println("2�� 5�� = " + exp);
		
		Scanner sc = new Scanner(System.in);
		int base, pow, expo = 1;
		
		System.out.print("���� �Է��ϼ��� : ");
		base = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		pow = sc.nextInt();
		
		for(int i=1; i<=pow; i++)
			expo *= base;
		System.out.println(base + "�� " + pow + "�� = "+ exp);
	}
}
