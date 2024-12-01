package Chap9_Exercise;

import java.awt.*;
import javax.swing.*;

public class MyFrame05 extends JFrame {
	public MyFrame05() {
		setTitle("FlowLayoutTest");
		setSize(300, 150);
		setLayout(new FlowLayout());
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame05 f = new MyFrame05();
	}

}
