package Chap3_Programming;

public class Chap3_Programming08 {

	public static void main(String[] args) {
		int cnt = 0;
		
		for(int a=1; a<=100; a++) {
			for(int b=1; b<=100; b++)
				for(int c=1; c<=100; c++) {
					if(a*a+b*b==c*c)
						System.out.println(a+"\t"+b+"\t"+c);
					if(a*a+c*c==b*b)
						System.out.println(a+"\t"+b+"\t"+c);
					if(c*c+b*b==a*a)
						System.out.println(a+"\t"+b+"\t"+c);
				}
		cnt++;
		}
		System.out.print(cnt+"개");
	}

}
