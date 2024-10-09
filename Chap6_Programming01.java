package java001_HelloWorld;

class Circle1{
	protected int radius;
	
	public Circle1(int r) {
		this.radius = r;
	}
}
class Pizza extends Circle1 {
    private String type;

    // Pizza 클래스의 생성자
    public Pizza(String type, int r) {
        super(r);  // 부모 클래스의 생성자를 호출하여 반지름 설정
        this.type = type;
    }

    // 피자의 정보를 출력하는 메서드
    public void print() {
        System.out.println("피자의 종류: " + type + ", 피자의 크기: " + radius);
    }
}
public class Chap6_Programming01 {

	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
        obj.print();
	}

}
