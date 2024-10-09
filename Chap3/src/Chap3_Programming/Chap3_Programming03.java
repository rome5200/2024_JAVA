package Chap3_Programming;

public class Chap3_Programming03 {

	public static void main(String[] args) {
		 for (int i = 1; i <= 50; i++) {
	            String str = Integer.toString(i);  // 숫자를 문자열로 변환

	            // 3, 6, 9가 하나라도 포함되어 있으면 "짝" 출력, 그렇지 않으면 숫자 출력
	            if (str.contains("3") || str.contains("6") || str.contains("9")) {
	                System.out.print("짝 ");
	            } else {
	                System.out.print(i + " ");
	            }
	        }
	    }
}
