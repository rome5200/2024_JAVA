package Chap5_Programming;

import java.util.Scanner;
import java.util.ArrayList;

class Contacts{
	private String name;
	private String tel;
	private String email;
	public static int count = 0;
}

public class Chap5_Programming06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contacts[] c = new Contacts[100];
		String name;
		int i = 0;
		System.out.println("연락처를 입력하시오 (종료 -1)");
		while(true) {
			c[i] = new Contacts();
			System.out.print("name & tel : ");
			c[i].name = sc.next();
			if(c[i].name.equals("-1"))
				break;
			c[i].tel = sc.next();
			c[i].email = sc.next();
			Contacts.count++;
			i++;
		}

        System.out.printf("입력된 연락처 수: %d\n", Contacts.count);

        System.out.print("검색할 이름을 입력하세요:");
        String searchName = sc.next();

        for (int j = 0; j < i; j++) {
            if (c[j].name.equals(name)) {
                System.out.println(name + " : " + c[j].tel+", "+c[j].email);
                break;
            }
        }

    }

}
