package Chap5_Programming;

import java.util.Scanner;

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
        System.out.printf("현재 잔액: %d원\n", balance);  // 잔액 출력 오류 수정
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void transfer(Account toAccount, int amount) {
        if (balance >= amount) {
            balance -= amount;
            toAccount.deposit(amount);  // 상대 계좌에 입금
            System.out.println(amount + "원이 이체되었습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

public class Chap5_Programming08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 개의 계좌 생성
        Account account1 = new Account(1000000);  // 계좌1: 1,000,000원
        Account account2 = new Account(2000000);  // 계좌2: 2,000,000원
        Account account3 = new Account(1500000);  // 계좌3: 1,500,000원

        // 사용자로부터 PIN 입력 받기 (PIN 검증 기능이 없으므로 의미상 입력만 받음)
        System.out.println("PIN을 입력하세요: ");
        int pin = sc.nextInt();

        // 메뉴 표시 및 선택
        while (true) {
            System.out.println("\n1. 현금 입금");
            System.out.println("2. 현금 출금");
            System.out.println("3. 계좌 이체");
            System.out.println("4. 종료");
            System.out.print("번호를 선택하세요: ");
            int choice = sc.nextInt();

            if (choice == 1) {  // 입금
                System.out.print("입금할 금액을 입력하세요: ");
                int amount = sc.nextInt();
                account1.deposit(amount);

            } else if (choice == 2) {  // 출금
                System.out.print("출금할 금액을 입력하세요: ");
                int amount = sc.nextInt();
                account1.withdraw(amount);

            } else if (choice == 3) {  // 이체
                System.out.println("이체할 계좌를 선택하세요 (2 또는 3): ");
                int transferTo = sc.nextInt();
                System.out.print("이체할 금액을 입력하세요: ");
                int amount = sc.nextInt();

                if (transferTo == 2) {
                    account1.transfer(account2, amount);
                } else if (transferTo == 3) {
                    account1.transfer(account3, amount);
                } else {
                    System.out.println("잘못된 계좌 번호입니다.");
                }

            } else if (choice == 4) {  // 종료
                System.out.println("ATM을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
        
    }
}