package Chap4_Programming;

class Rocket{
	int x, y;
	
	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "로켓의 현재 위치 ("+x+", "+y+")";
	}
	
	void moveUp() {
		y += 1;
	}
}

public class Chap4_Programming1 {

	public static void main(String[] args) {
		Rocket r = new Rocket(3, 1);
		System.out.println(r);
		r.moveUp();
		System.out.println(r);
	}

}
