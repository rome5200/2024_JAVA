package exponenetiation;

public class exp {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int exp = 1;
		for (int i = 1; i <= y; i++)
			exp *= x;
		System.out.println("2ÀÇ 5½Â = " + exp);
	}
}
