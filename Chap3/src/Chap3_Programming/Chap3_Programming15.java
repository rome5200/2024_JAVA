package Chap3_Programming;

public class Chap3_Programming15 {

	public static void main(String[] args) {
		int[][] a = new int[3][5];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*2);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
