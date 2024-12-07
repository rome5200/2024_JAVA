package Practice;

import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		f.setTitle("MyFrame");
		f.setSize(300, 200);
		f.setVisible(true); // 프레임이 화면에 나타나게 함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
