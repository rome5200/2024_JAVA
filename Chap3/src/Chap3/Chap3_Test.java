package Chap3;

public class Chap3_Test {

	public static void main(String[] args) {
		// 주말과 주중 출력하기
		var day = "MON";
		var today = "";
		switch(day) {
			case "SAT", "SUN" -> today = "주말";
			case "MON", "TUS", "WED", "THU", "FRI" -> today = "주중";
			default -> System.out.println("ERROR");
		}
		System.out.println(today);

	}

}
