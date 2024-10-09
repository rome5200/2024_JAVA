package Chap3_Programming;

public class Chap3_Programming06 {

	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {  // x의 최대 범위는 100/3
            for (int y = 0; y <= 10; y++) {  // y의 최대 범위는 100/10
                if (3 * x + 10 * y == 100) {  // 방정식을 만족하는 경우
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
	}
}
