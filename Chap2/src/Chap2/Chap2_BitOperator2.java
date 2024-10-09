package Chap2;

public class Chap2_BitOperator2 {

	public static void main(String[] args) {
		// 비트 이동 연산자
		int x = 0b00001101;
		int y = 0b00001010;
		System.out.println("x&y="+(x&y));
		System.out.println("x|y="+(x|y));
		System.out.println("x^y="+(x^y));
		System.out.println("~x="+(~x));
		System.out.println("x>>1="+(x>>1));
		System.out.println("x<<1="+(x<<1));
		System.out.println("x>>>1="+(x>>>1));
	}

}
