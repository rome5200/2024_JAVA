package Programming06;

interface Movable {
	void move(int dx, int dy);
}
class Circle implements Movable {
	int x, y;
	
	public void move(int dx, int dy) {
		x = dx;
		y = dy;
		System.out.println("Circle : x = "+ x + ", y = "+ y);
	}
}
class Rectangle implements Movable {
	int x, y;
	
	public void move(int dx, int dy) {
		x = dx;
		y = dy;
		System.out.println("Rectangle : x = "+ x + ", y = "+ y);
	}
}
public class MyClass {

	public MyClass() {
		Movable[] m = new Movable[2];
		m[0] = new Circle();
		m[1] = new Rectangle();
		
		int dx1 = (int) (Math.random() * 100);
		int dy1 = (int) (Math.random() * 100);
		m[0].move(dx1, dy1);

		int dx2 = (int) (Math.random() * 100);
		int dy2 = (int) (Math.random() * 100);
		m[1].move(dx2, dy2);
		
	}
	public static void main(String[] args) {
		new MyClass();
	}
}
