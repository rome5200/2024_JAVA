package programming12;

import java.util.Scanner;

public class programming12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int i = 0, l = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("성적을 입력하세요 : ");
			a[i] = sc.nextInt();
			if (a[i]==-1)
				break;
			else {
				l++;
				sum += a[i];
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/l);
	}
}
