package Programming03;

interface Animal {
	void walk();
	void fly();
	void sing();
}
interface Drawable {
	void draw();
}

public class Duck implements Animal, Drawable{
	@Override
	public void walk() {
		System.out.print("걸을 수 있음, ");
	}
	@Override
	public void fly() {
		System.out.print("날 수 있음, ");
	}
	@Override
	public void sing() {
		System.out.print("노래할 수 있음, ");
	}
	@Override
	public void draw() {
		System.out.print("그릴 수 있음");
	}
	public static void main(String[] args) {
		Duck duck = new Duck();
		System.out.print("Duck은 ");
		duck.walk();
		duck.fly();
		duck.sing();
		duck.draw();
	}

}