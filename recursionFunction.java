package recursionFunction;

public class recursionFunction {

	public static void main(String[] args) {
		System.out.println(Fact(10));
		System.out.print(Exp(2, 5));
	}
	static int Fact(int n) {
		if (n==1)
			return 1;
		else
			return n*Fact(n-1);
	}
	static int Exp(int x, int y) {
		if(y == 0)
			return 1;
		else
			return x*Exp(x, y-1);
	}
}