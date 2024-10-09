package Chap4_Programming;

class Person{
	public String name;
	private String mobile;
	private String office;
	private String email;
	
	public Person(String n, String m, String o, String e) {
		name = n;
		mobile = m;
		office = o;
		email = e;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name+" "+mobile+" "+office+" "+email;
	}

}

public class Chap4_Programming2 {

	public static void main(String[] args) {
		Person person = new Person("김혜현", "010-1111-1111", "010-1111-1112", "naver.com");
		System.out.println(person);
		person.setOffice("010-1212-2121");
		System.out.println(person);
	}

}
