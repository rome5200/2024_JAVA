package orange;
import java.util.*;

public class orange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("오렌지의 개수를 입력하시오 : ");
		int num = sc.nextInt();
		
		int box = num / 10;
		int rest = num % 10;
		
		System.out.print(box + "박스가 필요하고 " + rest + "개가 남습니다.");
		

	}

}
