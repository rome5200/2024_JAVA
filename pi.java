package pi;

public class pi {

	public static void main(String[] args) {
		double pi = 0;
		double sign = 1;
		for(int i=1;i<=1000000;i++) {
			pi += sign/(2*i-1);
			sign *= -1;
		}
		System.out.print(4*pi);
	}
}
