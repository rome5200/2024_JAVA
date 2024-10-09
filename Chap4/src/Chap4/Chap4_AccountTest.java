package Chap4;

class Account{
	//private int regNumber;
	private String name;
	private int balance;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
}

public class Chap4_AccountTest {
	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.printf("이름은 %s 통장잔고는 %d입니다.", obj.getName(), obj.getBalance());
	}

}
