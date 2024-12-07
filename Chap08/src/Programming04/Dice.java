package Programming04;

import java.util.Random;

public class Dice {
	private int value; // 주사위 면의 값을 저장

    // 생성자: 주사위 면을 1로 초기화
    public Dice() {
        this.value = 1;
    }

    // 주사위를 굴려 1~6 사이의 숫자를 반환
    public int roll() {
        Random random = new Random();
        this.value = random.nextInt(6) + 1; // 1~6 사이 난수 생성
        return this.value;
    }

    // 주사위 면 값을 설정
    public void setValue(int v) {
        if (v >= 1 && v <= 6) {
            this.value = v;
        } else {
            throw new IllegalArgumentException("주사위 값은 1에서 6 사이여야 합니다.");
        }
    }

    // 현재 주사위 면 값을 반환
    public int getValue() {
        return this.value;
    }

    // 주사위의 상태를 문자열로 반환
    @Override
    public String toString() {
        return "현재 주사위 값: " + this.value;
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        Dice dice = new Dice(); // 주사위 객체 생성

        // 초기값 확인
        System.out.println(dice); // 현재 주사위 값: 1

        // 주사위 굴리기
        System.out.println("주사위를 굴립니다...");
        System.out.println("굴린 결과: " + dice.roll());

        // 주사위 값 설정
        dice.setValue(5);
        System.out.println("주사위 값을 5로 설정했습니다.");
        System.out.println(dice);

        // 주사위 값 가져오기
        System.out.println("현재 주사위 값: " + dice.getValue());
    }

}
