package java001_HelloWorld;

class Rectangle{
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
class ColorRectangle extends Rectangle{
	String color;
	
	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}

public class Chap6_Programming04 {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");

        // 사각형의 너비, 높이, 색상 출력
        System.out.println("가로: " + obj.getWidth());
        System.out.println("세로: " + obj.getHeight());
        System.out.println("색상: " + obj.getColor());

	}

}
