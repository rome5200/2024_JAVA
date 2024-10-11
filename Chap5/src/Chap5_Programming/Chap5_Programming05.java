package Chap5_Programming;

class Circle1{
	private int radius;
	public int getRadius() {
		return radius;
	}
	public Circle1() {
		this.radius = (int)(Math.random()*101);
	}
	public String ToString() {
		return "Circle [radius = "+radius;
	}
}

public class Chap5_Programming05 {

	public static void main(String[] args) {
		Circle1[] list = new Circle1[3];
		for (int i = 0; i < list.length; i++) {
			list[i] = new Circle1();
			System.out.println(list[i].getRadius());
		}

	}

}
