package Practice;

import java.awt.*;
import javax.swing.*;

public class MyFrame03 extends JFrame {

	public MyFrame03() {
		setSize(300, 150); // JFrame의 크기를 설정
		setLocation(200, 300); // JFrame의 위치를 설정
		setTitle("MyFrame");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.yellow); // 배경색을 설정한다.
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		this.add(button1);
		this.add(button2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame03 f = new MyFrame03();
	}

}
