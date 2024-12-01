package Chap9_Exercise;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame01 extends JFrame {

	public MyFrame01() {
		setSize(300, 200);
		setTitle("MyFrame");
		
		// 버튼 추가하기(14 ~16)
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		add(button);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrame01 f = new MyFrame01();
	}

}
