package Chap2;

import java.util.*;

public class Chap2_InputString {

	public static void main(String[] args) {
		// 이름과 나이를 받는 프로그램
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		
		System.out.print(name+"님 안녕하세요!"+age+"살이시네요.");
	}

}
