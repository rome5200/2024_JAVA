package Chap4;

public class Chap4_DeskLampTest {

	public static void main(String[] args) {
		Chap4_DeskLamp myLamp = new Chap4_DeskLamp(); // 객체 생성
		
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}

}
