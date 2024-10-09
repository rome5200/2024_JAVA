package Chap2_Programming;

import java.util.Scanner;

public class Chap2_Programming07 {

	public static void main(String[] args) {
		// 부가세와 잔돈 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("받은 돈 : ");
		int getMoney = sc.nextInt();
		System.out.print("상품 가격 : ");
		int price = sc.nextInt();
		
		int tax = price / 10;
		System.out.println("부가세 : "+tax);
		
		int change = getMoney - price;
		System.out.println("부가세 : "+change);
		
	}

}
