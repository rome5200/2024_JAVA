package pyramid;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		
		String s = sc.next();
		char c = s.charAt(0);
		for (int i='a'; i<=c; i++) {
			for (int j = 'a'; j<=i; j++)
				System.out.print((char)j);
			System.out.println();
		}

    // 반 피라미드 그리기
    // 1. n줄 그린다
    // 2. 각 줄에서는 바깥 루프의 i개 만큼 그린다
    for(int i = 1; i<=5;i++) {
	for(int j = 1; j<=i; j++)
		System.out.print("*");
	System.out.println();
    }

    // 피라미드 그리기
    //       *
    //      ***
    //     *****
    //    *******
    for(int i = 1; i<=5;i++) {
	for(int j = 1; j<=5-i;j++)
		System.out.print(" ");
	for(int j = 1; j <= 2*i-1; j++)
		System.out.print("*");
	System.out.println();
    }

    // 반피라미드2
    // ....*  i=1  빈칸=n-i, *=i
    // ...**
    // ..***
    // .****
    // *****
    for(int i = 1; i<=5; i++) {
	for (int j = 1; j <= 5-i; j++)
		System.out.print(" ");
	for (int j = 1; j <= i; j++)
		System.out.print("*");
	System.out.println();
   }

    // 역피라미드
    // *******  i=1  빈칸 = i-1, * = 2*(n-i)+1
    // .*****
    // ..***
    // ...*
   for(int i = 1; i<= 5; i++) {
	for(int j = 1; j<= i-1; j++)
		System.out.print(" ");
	for(int j = 1; j<=2*(5-i)+1;j++)
		System.out.print("*");
	System.out.println(" ");
	}
  }
/*

*****
****
***
**
*

*/
  for(int i = 0; i< 5; i++) {
	for(int j = 5; j>i ; j--)
		System.out.print("*");
	System.out.println();
  }

	for(int i = 0; i< 5; i++) {
		for(int j = 0; j < i; j++)
			System.out.print(" ");
		for(int j = 5; j>i ; j--)
			System.out.print("*");
	System.out.println();
	}
	

}
