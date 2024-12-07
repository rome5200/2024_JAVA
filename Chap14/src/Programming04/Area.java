package Programming04;

interface Shape{
	public int getArea(int side);
}

public class Area {
	public static void main(String[] args) {
		Shape s = side -> side*side;
		System.out.println(s.getArea(2));
	}

}
