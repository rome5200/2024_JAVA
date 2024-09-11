package pprogramming15;

import java.util.*;

public class pprogramming15 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] a = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
		for (int i = 0; i<3;i++) {
			for(int l=0; l<5;l++) {
				a[i][l]=random.nextInt(2);
				System.out.print(a[i][l]);
			}
			System.out.println();
		}
		int count = 0;
		int r,c;
		while(true) {
			r=(int) (Math.random()*3);
			c=(int) (Math.random()*5);
			if(a[r][c]==0) {
				a[r][c]=1;
				count++;
			}
			if(count == 5)
				break;
		}
		for (r=0; r<3;r++) {
			for(c=0;c<5;c++) {
				System.out.print(a[r][c]+"\t");
			}
		System.out.println();
		}
	}
}
