package Chap3_Programming;

public class Chap3_Programming04 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if (i%3 == 0)
				sum += i;
			if (i%4 == 0)
				sum += i;
			if (i%3 == 0 && i%4 == 0)
				sum -= i;
		}
		System.out.printf("3 또는 4의 배수의 합 = %d", sum);

	}

}
