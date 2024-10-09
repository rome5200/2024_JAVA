package Chap3;

import java.util.Arrays;

public class Chap3_RaggedArray {

	public static void main(String[] args) {
		// 래그드 배열
		int[][] rarray = new int[3][];
		
		rarray[0] = new int[] {1, 2, 3, 4};
		rarray[1] = new int[] {5, 6, 7};
		rarray[2] = new int[] {8, 9};
		
		for(int[] a :rarray)
			System.out.println(Arrays.toString(a));
	}

}
