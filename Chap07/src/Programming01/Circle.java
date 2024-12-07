package Programming01;

interface getInfo{
	public double perimeter();
	public double area();
}

public class Circle implements getInfo {
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	public static void main(String[] args) {
		Circle c1 = new Circle(5.0);
		System.out.println("둘레 = "+c1.perimeter());
		System.out.println("넓이 = "+c1.area());
	}

}
