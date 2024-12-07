package Programming01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
	private int clickCount = 0; // 버튼 클릭 횟수 저장
    private JButton button; // 버튼 컴포넌트
    private JLabel label; // 클릭 횟수를 표시할 레이블

    public MyFrame() {
        setTitle("버튼 클릭 횟수");
        setSize(300, 150);

        // 레이아웃 설정
        setLayout(new BorderLayout());

        // 버튼 생성 및 상단에 배치
        button = new JButton("클릭!");
        button.addActionListener(this); // 버튼에 이벤트 리스너 등록
        add(button, BorderLayout.CENTER);

        // 레이블 생성 및 하단에 배치
        label = new JLabel("버튼을 눌러보세요!", SwingConstants.CENTER);
        add(label, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // 창 표시
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 버튼 클릭 시 호출
        clickCount++;
        label.setText("클릭 횟수: " + clickCount); // 클릭 횟수 업데이트
    }

    public static void main(String[] args) {
        new MyFrame(); // 프로그램 실행
    }
}
