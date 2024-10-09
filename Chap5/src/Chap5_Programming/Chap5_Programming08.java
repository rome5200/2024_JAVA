package java001_HelloWorld;

import java.util.Scanner;

class Account{
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount+"원이 입금되었습니다.");
		System.out.printf("현재 잔액 : %d원");
	}
}

public class Chap5_Programming08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
