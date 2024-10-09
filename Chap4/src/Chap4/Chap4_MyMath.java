package Chap4;

public class Chap4_MyMath {

	int add(int x, int y) { return x+y; }
	int add(int x, int y, int z) { return x+y+z; }
	int add(int x, int y, int z, int w) { return x+y+z+w; }
	public static void main(String[] args) {
		Chap4_MyMath obj;
		obj = new Chap4_MyMath();
		System.out.print(obj.add(10, 20)+" ");
		System.out.print(obj.add(10, 20, 30)+" ");
		System.out.print(obj.add(10, 20, 30, 40)+" ");
	}

}
