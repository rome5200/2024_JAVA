package Programming08;

import java.util.HashMap;
import java.util.Map;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {
			new String("Kim"),
			new String("Choi"),
			new String("Park"),
			new String("Kim"),
			new String("Kim"),
			new String("Park"),
		};
		
		 Map<String, Integer> nameCountMap = new HashMap<>();

	        // 배열 순회하여 Map에 저장
	        for (String name : names) {
	            if (nameCountMap.containsKey(name)) {
	                nameCountMap.put(name, nameCountMap.get(name) + 1); // 기존 이름 등장 횟수 증가
	            } else {
	                nameCountMap.put(name, 1); // 새로운 이름 추가
	            }
	        }

	        // 결과 출력
	        System.out.println("3개의 이름이 발견되었습니다.");
	        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue() + "회");
	        }
	}

}
