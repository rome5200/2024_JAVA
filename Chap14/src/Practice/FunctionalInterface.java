package Practice;

interface MyMath{
	int calculate(int x);
}

public class FunctionalInterface {

	public static void main(String[] args) {
		int value = 9;
		MyMath s = (int x) -> x*x;
		int y = s.calculate(value);
		System.out.println(y);

	}

}
