package Chap4;

public class Chap4_Circle {

	public int radius; // 필드
	public String color; // 필드
	
	public double getArea() { // 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Chap4_Circle obj; // 참조 변수 선언
		obj = new Chap4_Circle(); // 객체 생성
		obj.radius = 100; // 객체의 radius 필드에 접근
		obj.color = "blue"; // 객체의 color 필드에 접근
		double area = obj.getArea(); // 객체 메소드 getArea() 접근
		System.out.printf("원의 면적 = %f", area);
	}

}
