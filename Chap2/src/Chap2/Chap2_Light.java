package Chap2;

public class Chap2_Light {

	public static void main(String[] args) {
		// 1광년 거리 계산하기
		final double LIGHT_SPEED = 3e5;
		double distance;
		
		distance = LIGHT_SPEED*365*24*60*60;
		System.out.println("빛이 1년 동안 가는 거리 : "+distance+"km.");
	}

}
