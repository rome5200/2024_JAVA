package Chap4;

public class Chap4_DeskLamp {

	private boolean isOn;
	public void turnOn() { isOn = true; }
	public void turnOff() { isOn = false; }
	public String toString() {
		return "현재상태는 "+ (isOn == true ? "켜짐" : "꺼짐");
	}
}
