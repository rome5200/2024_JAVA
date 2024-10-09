package Chap3;

public class Chap3_ArrayTest1 {

	public static void main(String[] args) {
		// 배열 생성하기
		int[] s = new int[10];
		
		for(int i = 0; i < s.length; i++)
			s[i] = i;
		
		for(int i = 0; i < s.length; i++)
			System.out.print(s[i]+" ");
	}

}
