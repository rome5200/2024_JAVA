package Chap3_Programming;

import java.util.Scanner;

public class Chap3_Programming02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산을 입력하세요 : ");
		char operator = sc.next().charAt(0);
		
		System.out.print("피연산자 2개를 입력하세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result1 = 0;
		double result2 = 0;
		
		if (operator == '+') {
            result1 = x + y;
            System.out.printf("%d+%d=%d\n", x, y, result1);
        }
		else if (operator == '-') {
            result1 = x - y;
            System.out.printf("%d-%d=%d\n", x, y, result1);
        }
		else if (operator == '*') {
            result1 = x * y;
            System.out.printf("%d*%d=%d\n", x, y, result1);
        }
		else if (operator == '/') {
           if (y != 0) {
        	   result2 = (double)x / (double)y;
        	   System.out.printf("%d/%d=%.2f\n", x, y, result2);
           }
           else {
               System.out.println("0으로 나눌 수 없습니다.");
           }
        } 
        else {
            System.out.println("잘못된 연산자입니다. +, -, *, / 중 하나를 입력하세요.");
        }
	}
}
