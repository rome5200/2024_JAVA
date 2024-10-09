package Chap5;

class Pizza{
	private String toppings;
	private int radius;
	static final double PI = 3.141592;
	static int count = 0;
		
	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}
}

public class Chap5_PizzaCountTest {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		int n = Pizza.count;
		System.out.println("지금까지 판매된 피자 개수 = "+n);
	}

}
