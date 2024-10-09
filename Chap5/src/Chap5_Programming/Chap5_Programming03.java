package Chap5_Programming;

class MyMetric{
	static void kiloToMile(double kilo) {
		System.out.println("1km를 마일로 바꾸면 "+kilo*0.6213);
	}
	static void mileToKilo(double mile) {
		System.out.println("1마일를 킬로로 바꾸면 "+mile*1.6093);
	}
}

public class Chap5_Programming03 {

	public static void main(String[] args) {
		MyMetric.kiloToMile(1);
		MyMetric.mileToKilo(1);
	}

}
