package Chap5;

class Pizza1{
	int radius;
	
	Pizza1(int r){
		radius = r;
	}
	Pizza1 whosLargest(Pizza1 p1, Pizza1 p2) {
		if (p1.radius > p2.radius)
			return p1;
		else
			return p2;
	}
}

public class Chap5_Pizzatest {

	public static void main(String[] args) {
		Pizza1 obj1 = new Pizza1(14);
		Pizza1 obj2 = new Pizza1(18);
		
		Pizza1 largest = obj1.whosLargest(obj1, obj2);
		System.out.println(largest.radius+"인치 피자가 더 큼.");

	}

}
