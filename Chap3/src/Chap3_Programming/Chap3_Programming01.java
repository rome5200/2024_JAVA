package Chap3_Programming;

import java.util.Scanner;

public class Chap3_Programming01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        case 3:
            System.out.println("Three");
            break;
        case 4:
            System.out.println("Four");
            break;
        case 5:
            System.out.println("Five");
            break;
        case 6:
            System.out.println("Six");
            break;
        case 7:
            System.out.println("Seven");
            break;
        case 8:
            System.out.println("Eight");
            break;
        case 9:
            System.out.println("Nine");
            break;
        default:
            System.out.println("잘못된 입력입니다. 1부터 9까지의 숫자를 입력하세요.");
            break;
		}

	}

}
