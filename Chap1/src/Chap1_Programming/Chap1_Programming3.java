package Chap1_Programming;

public class Chap1_Programming3 {

	public static void main(String[] args) {
		//다이아몬드 출력하기
		for(int i = 1; i<=3;i++) {
			for(int j = 1; j <= 3-i; j++)
				System.out.print(" ");
			for(int j = 1; j <= i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = 2; i>=1; i--) {
			for(int j = 1; j<=3-i; j++)
				System.out.print(" ");
			for(int j = 1; j <= i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
