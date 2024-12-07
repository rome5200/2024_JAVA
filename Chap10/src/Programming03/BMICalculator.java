package Programming03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame implements ActionListener {
    private JTextField weightField, heightField; // 체중과 키를 입력받는 텍스트 필드
    private JLabel resultLabel; // BMI 결과를 표시할 레이블

    public BMICalculator() {
        setTitle("BMI 계산기");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 상단 안내문 레이블
        JLabel guideLabel = new JLabel("나의 BMI 지수는 얼마나 될까?");
        guideLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(guideLabel, BorderLayout.NORTH);

        // 입력 패널 (중앙)
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 5, 5)); // 2행 2열, 5px 간격

        inputPanel.add(new JLabel("나의 체중 (kg):"));
        weightField = new JTextField();
        inputPanel.add(weightField);

        inputPanel.add(new JLabel("나의 키 (m):"));
        heightField = new JTextField();
        inputPanel.add(heightField);

        add(inputPanel, BorderLayout.CENTER);

        // 하단 버튼 및 결과 레이블
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        JButton calculateButton = new JButton("BMI 계산하기");
        calculateButton.addActionListener(this); // 버튼 클릭 이벤트 등록
        bottomPanel.add(calculateButton, BorderLayout.NORTH);

        resultLabel = new JLabel("결과가 여기에 표시됩니다.", SwingConstants.CENTER);
        bottomPanel.add(resultLabel, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true); // 창 표시
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // 사용자의 체중과 키 입력 값 가져오기
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            // BMI 계산
            double bmi = weight / (height * height);

            // 결과 표시
            resultLabel.setText(String.format("당신의 BMI는 %.2f 입니다.", bmi));
        } catch (NumberFormatException ex) {
            // 유효하지 않은 입력 처리
            resultLabel.setText("올바른 값을 입력하세요!");
        }
    }

    public static void main(String[] args) {
        new BMICalculator(); // 프로그램 실행
    }
}