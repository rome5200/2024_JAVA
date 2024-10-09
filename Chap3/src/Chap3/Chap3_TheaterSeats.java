package Chap3;

public class Chap3_TheaterSeats {

	public static void main(String[] args) {
		// 극장 안 관객 수 세기
		int [][] seats = {{0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
						  {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
						  {0, 0, 0, 0, 0, 0, 1, 1, 1, 0} };
		int count = 0;
		for(int i = 0; i < seats.length; i++)
			for (int j = 0; j < seats[i].length; j++)
				count += seats[i][j];
		System.out.printf("현재 관객 수는 %d명 입니다.", count);

	}

}
