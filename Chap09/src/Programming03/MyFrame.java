package Programming03;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	MyFrame(){
		setSize(500, 200);
		setTitle("My Frame");
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하시오");
		
		p1.add(label);
		JButton[] btn = new JButton[5];
		for(int i = 0; i < 5; i++) {
			btn[i] = new JButton((i+1)+"일");
			p2.add(btn[i]);
		}
		panel.add(p1);
		panel.add(p2);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
