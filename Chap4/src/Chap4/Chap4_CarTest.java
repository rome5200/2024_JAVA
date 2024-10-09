package Chap4;

class Car{
	String color;
	int speed;
	int gear;
	
	@Override
	public String toString() {
		return "Car [color="+color+", speed="+speed+", gear+"+gear+"]";
	}
	
	void chageGear(int g) { gear = g; }
	void speedUp() { speed += 10; }
	void speedDown() { speed -= 10; }
}

public class Chap4_CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.chageGear(1);
		myCar.speedUp();
		System.out.println(myCar);

	}

}
