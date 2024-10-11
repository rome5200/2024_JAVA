package Chap2_MiniProject;

import java.util.Scanner;

public class Chap2_MiniProject1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("1. 화씨 -> 섭씨\n2. 섭씨 -> 화씨");
		System.out.println("----------------------");
		System.out.print("번호를 입력하세요 : ");
		int n = sc.nextInt();
		
		System.out.println((n==1)?"화씨온도를 입력하세요":"섭씨온도를 입력하세요");
		double temp = sc.nextDouble();
		double result = (n==1)?(temp-32)*5/9 :temp*9/5+32;
		System.out.println((n==1)?"섭씨온도는 "+result:"화씨온도는 "+result);
		
	}

}
