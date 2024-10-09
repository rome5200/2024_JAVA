package java001_HelloWorld;

class Circle{
	private int radius;
	public int getRadius() {
		return radius;
	}
	public Circle() {
		this.radius = (int)((Math.random()*100)+1);
	}
	public String ToString() {
		return "Circle [radius = "+radius;
	}
}

public class Chap5_Programming05 {

	public static void main(String[] args) {
		Circle[] list = new Circle[3];
		for (int i = 0; i < list.length; i++) {
			list[i] = new Circle();
			System.out.println(list[i].getRadius());
		}
	}
}
