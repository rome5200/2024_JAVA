package java001_HelloWorld;

class Sports{
	String getName() {
		return "아직 결정되지 않음";
	}
	int getPlayers() {
		return 0;
	}
}

class Soccer extends Sports{
	@Override
	String getName() {
		return "축구";
	}
	@Override
	int getPlayers() {
		return 11;
	}
}

public class Chap6_Programming03 {

	public static void main(String[] args) {
		 Soccer soccerGame = new Soccer();

	        // 축구 경기 이름과 선수 수 출력
	        System.out.println("경기 이름: " + soccerGame.getName());
	        System.out.println("참가 선수 수: " + soccerGame.getPlayers());

	}

}
