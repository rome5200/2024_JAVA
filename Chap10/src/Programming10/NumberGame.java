package Programming10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberGame extends JFrame {
    private int randomNum;
    private JTextField inputField;
    private JLabel guideLabel;

    public NumberGame() {
        // 랜덤 숫자 생성
        randomNum = (int) (Math.random() * 100) + 1;

        // 프레임 설정
        JFrame frame = new JFrame("숫자 게임");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 상단 패널 (입력 필드와 안내 문구)
        JPanel topPanel = new JPanel();
        JLabel infoLabel = new JLabel("숫자를 추측하시오: ");
        inputField = new JTextField(10);
        topPanel.add(infoLabel);
        topPanel.add(inputField);

        // 중앙 패널 (결과 안내 레이블)
        guideLabel = new JLabel("숫자를 입력하시오.");
        guideLabel.setOpaque(true);
        guideLabel.setBackground(Color.WHITE);
        guideLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // 하단 패널 (버튼)
        JPanel bottomPanel = new JPanel();
        JButton retryButton = new JButton("새 게임");
        JButton exitButton = new JButton("종료");
        bottomPanel.add(retryButton);
        bottomPanel.add(exitButton);

        // 이벤트 리스너 추가
        inputField.addActionListener(e -> handleInput());
        retryButton.addActionListener(e -> resetGame());
        exitButton.addActionListener(e -> System.exit(0));

        // 프레임에 컴포넌트 추가
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(guideLabel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // 프레임 표시
        frame.pack();
        frame.setVisible(true);
    }

    private void handleInput() {
    	int userGuess = Integer.parseInt(inputField.getText());
        if (userGuess < randomNum) {
            guideLabel.setText("너무 낮습니다!");
            guideLabel.setBackground(Color.RED);
        } else if (userGuess > randomNum) {
            guideLabel.setText("너무 높습니다!");
            guideLabel.setBackground(Color.RED);
        } else {
            guideLabel.setText("정답입니다!");
        }
        inputField.selectAll();
    }

    private void resetGame() {
        randomNum = (int) (Math.random() * 100) + 1;
        guideLabel.setText("숫자를 입력하시오.");
        guideLabel.setBackground(Color.WHITE);
        inputField.setText("");
    }

    public static void main(String[] args) {
        new NumberGame();
    }
}

