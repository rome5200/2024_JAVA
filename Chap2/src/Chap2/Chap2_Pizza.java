package Chap2;

import java.util.*;

public class Chap2_Pizza {

	public static void main(String[] args) {
		// 조건 연산자를 활용하여 피자 주문하기
		double area1 = 2*3.141592*20*20;
		double area2 = 3.141592*30*30;
		System.out.println("20cm 피자 면적="+area1);
		System.out.println("30cm 피자 면적="+area2);
		System.out.println((area1 > area2)?"20cm 두 개":"30cm 한 개");
	}

}
