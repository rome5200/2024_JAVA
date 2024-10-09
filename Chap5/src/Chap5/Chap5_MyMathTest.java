package Chap5;

class MyMath{
	public static int abs(int x) { return x>0?x:-x; }
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i = 1; i<= exponent; i++)
			result *= base;
		return result;
	}
	public static int cube(int x) {
		int result = x*x*x;
		return result;
	}
}

public class Chap5_MyMathTest {

	public static void main(String[] args) {
		System.out.println("10의 3승은 "+MyMath.power(10, 3));
		System.out.println("10*10*10은 "+MyMath.cube(10));
	}

}
