package Practice;

import java.awt.*;
import javax.swing.*;

public class MyFrame06 extends JFrame {
	public MyFrame06() {
		setTitle("BorderLayoutTest");
		setSize(300, 150);
		setLayout(new BorderLayout());
		
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("South");
		JButton b3 = new JButton("East");
		JButton b4 = new JButton("West");
		JButton b5 = new JButton("Center");
		
		add(b1, "North");
		add(b2, "South");
		add(b3, "East");
		add(b4, "West");
		add(b5, "Center");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame06 f = new MyFrame06();
	}

}
