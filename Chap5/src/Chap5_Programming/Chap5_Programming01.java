package Chap5_Programming;

class BankAccount{
	private int balance;
	
	BankAccount(int balance){
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void transfer(int amount, BankAccount otherAccount) {
		this.balance -= amount;
		otherAccount.balance += amount;
	}
	public String toString() {
		return "BankAccount [balance = "+balance+"]";
	}
}

public class Chap5_Programming01 {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(10000);
		BankAccount a2 = new BankAccount(0);
		System.out.println("a1 : "+a1);
		System.out.println("a2 : "+a2);
		a1.transfer(1000, a2);
		System.out.println("---transfer 호출 후---");
		System.out.println("a1 : "+a1);
		System.out.println("a2 : "+a2);
	}

}
