package Chap3_Programming;

public class Chap3_Programming07 {

	public static void main(String[] args) {
		System.out.println("2부터 100 사이의 소수:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
	}
}