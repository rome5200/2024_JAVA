package Chap3_Programming;

import java.util.Scanner;

public class Chap3_Programming09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 항의 개수 : ");
		int num = sc.nextInt();
		
		int f1 = 0, f2 = 1;
		
		if (num >= 1)
			System.out.print(f1+" ");
		if (num >= 2)
			System.out.print(f1+f2+" ");
		for (int i = 3; i <= num; i++) {
			int next = f1 + f2;
			System.out.print(next + " ");
			f1 = f2;
			f2 = next;
		}

	}

}
