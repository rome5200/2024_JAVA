package Chap5_Programming;

import java.util.Scanner;
import java.util.ArrayList;

class Contacts{
	private String name;
	private String tel;
	private String email;
	public static int count = 0;
	
	public Contacts(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		count++;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
}

public class Chap5_Programming06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Contacts>a = new ArrayList<Contacts>();
		
		System.out.println("연락처를 입력하시오 (종료 -1)");
		do {
			System.out.print("이름과 전화번호, 이메일을 입력하시오 : ");
			String name = sc.next();
			if (name.equals("-1")) break;
            String tel = sc.next();
            String email = sc.next();
            a.add(new Contacts(name, tel, email));
		} while (true);

        System.out.printf("입력된 연락처 수: %d\n", Contacts.count);

        System.out.print("검색할 이름을 입력하세요:");
        String searchName = sc.next();

        boolean found = false;
        for (Contacts contact : a) {
            if (contact.getName().equals(searchName)) {
                System.out.printf("이름: %s, 전화번호: %s, 이메일: %s\n", 
                		contact.getName(), contact.getTel(), contact.getEmail());
                found = true;
                break;  // 연락처를 찾으면 반복 종료
            }
        }
        if (!found) {
            System.out.println(searchName + "의 연락처를 찾을 수 없습니다.");
        }

    }

}
