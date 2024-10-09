package Chap4;

class Box {
	int width, length, height;
	double getVoume() { return (double) width*height*length; }
	
	public Box(int w, int h, int l) {
		width = w;
		height =h;
		length = l;
	}
}

public class Chap4_BoxTest {

	public static void main(String[] args) {
		Box b = new Box(20, 30, 20);
		System.out.printf("상자의 가로, 세로, 높이는 %d, %d, %d입니다.\n", b.width, b.length, b.height);
		System.out.printf("상자의 부피는 %f입니다.", b.getVoume());

	}

}
