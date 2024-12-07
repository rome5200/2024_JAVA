package Programming09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		ArrayList<Double> scores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("심사위원들의 점수를 입력하세요 (10명의 점수, 범위: 0.0 ~ 10.0):");

        // 10개의 점수를 입력받음
        for (int i = 0; i < 4; i++) {
            double score;
            while (true) {
                System.out.print((i + 1) + "번째 점수: ");
                score = sc.nextDouble();
                if (score >= 0.0 && score <= 10.0) {
                    break; // 올바른 점수이면 루프 종료
                } else {
                    System.out.println("점수는 0.0에서 10.0 사이여야 합니다. 다시 입력하세요.");
                }
            }
            scores.add(score);
        }

        // 점수 출력
        System.out.println("\n입력된 점수: " + scores);

        // 최저 점수 제거
        double minScore = Collections.min(scores);
        scores.remove(minScore);
        double maxScore = Collections.max(scores);
        scores.remove(maxScore);

     // 합계 계산
        double total = 0.0;
        for (double score : scores) {
            total += score;
        }

        // 결과 출력
        System.out.printf("점수의 합 : %.1f\n", total);
	}
}
