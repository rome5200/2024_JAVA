package Chap2_MiniProject;

import java.util.Scanner;

public class Chap2_MiniProject2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("1. 화씨 -> 섭씨\n2. 섭씨 -> 화씨");
		System.out.println("----------------------");
		
		System.out.print("번호를 입력하세요 : ");
		int n = sc.nextInt();
		double temp;
		if(n==1) {
			System.out.print("화씨온도를 입력하세요 : ");
			temp = sc.nextDouble();
			double result = (temp-32)*5/9;
			System.out.println("섭씨온도는 "+result);
		}
		else {
			System.out.print("섭씨온도를 입력하세요 : ");
			temp = sc.nextDouble();
			double result = temp*9/5+32;
			System.out.println("화씨온도는 "+result);
		}
	}

}
