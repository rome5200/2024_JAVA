package Chap2;

public class Chap2_AreaTest {

	public static void main(String[] args) {
		//원의 면적 계산하기
		final double PI = 3.141592;
		double radius, area;
		
		radius = 5.0;
		area = PI*radius*radius;
		System.out.println("반지름이 5인 원의 면적은 "+area);
	}

}
