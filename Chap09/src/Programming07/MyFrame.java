package Programming07;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		JButton[] jb = new JButton[20];
		setSize(500,300);
		setLayout(new GridLayout(4,5));
		for(int i=0; i<20; i++) {
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			Color color = new Color(r,g,b);
			jb[i] = new JButton(i+"");
			jb[i].setBackground(color);
			add(jb[i]);
		}
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}
