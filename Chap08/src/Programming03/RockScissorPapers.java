package Programming03;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPapers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("가위바위보 게임입니다!");
        System.out.println("0: 가위, 1: 바위, 2: 보 중 하나를 선택하세요.");
        
        while (true) {
            // 사용자 입력 받기
            System.out.print("당신의 선택 (0: 가위, 1: 바위, 2: 보): ");
            int userChoice = scanner.nextInt();
            
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("잘못된 입력입니다. 0, 1, 2 중 하나를 선택하세요.");
                continue;
            }

            // 컴퓨터의 난수 생성
            int computerChoice = random.nextInt(3);

            // 선택을 문자열로 변환
            String[] choices = {"가위", "바위", "보"};
            System.out.println("컴퓨터의 선택: " + choices[computerChoice]);
            System.out.println("당신의 선택: " + choices[userChoice]);

            // 승부 판단
            if (userChoice == computerChoice) {
                System.out.println("결과: 무승부!");
            } else if ((userChoice == 0 && computerChoice == 2) || 
                       (userChoice == 1 && computerChoice == 0) || 
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("결과: 당신이 이겼습니다!");
            } else {
                System.out.println("결과: 컴퓨터가 이겼습니다!");
            }

            // 다시 플레이할지 여부 확인
            System.out.print("다시 하시겠습니까? (y/n): ");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("n")) {
                System.out.println("게임을 종료합니다. 감사합니다!");
                break;
            }
        }
	}

}
