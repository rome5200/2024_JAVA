package pprogramming15;

import java.util.Random;

public class pprogramming15 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] a = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
		for (int i = 0; i<3;i++) {
			for(int l=0; l<5;l++) {
				a[i][l]=r.nextInt(2);
				System.out.print(a[i][l]);
			}
			System.out.println();
		}
	}
}
