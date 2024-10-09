package Chap3;

import java.util.ArrayList;

public class Chap3_ArrayList {

	public static void main(String[] args) {
		// ArrayList 사용하기
		ArrayList<String> list = new ArrayList<>();
		list.add("철수");
		list.add("영희");
		list.add("순신");
		list.add("지영");
		
		for(String obj : list)
			System.out.print(obj+" ");
	}

}
