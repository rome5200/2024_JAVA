package Chap6_Programming;

class Animal{
	void walk() {
		System.out.println("걸을 수 있음");
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("날 수 있음");
	}
	void sing() {
		System.out.println("노래 부를 수 있음");
	}
}

public class Chap6_Programming02 {

	public static void main(String[] args) {
		Bird bird = new Bird();  // Bird 객체 생성

        // Animal 클래스의 메서드
        bird.walk();  // 새도 걷는 행동 가능

        // Bird 클래스의 고유 메서드
        bird.fly();   // 새는 날 수 있음
        bird.sing();  // 새는 노래할 수 있음

	}

}