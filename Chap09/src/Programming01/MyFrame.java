package Programming01;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame extends JFrame {
	private JLabel label;
	private JButton jb1, jb2;
	public MyFrame() {
		setSize(300,150);
		setLayout(new FlowLayout());
		label = new JLabel("Java is interesting");
		jb1 = new JButton("yes");
		jb2 = new JButton("no");		
		add(label);
		add(jb1);
		add(jb2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
