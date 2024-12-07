package Programming02;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

public class Clock extends JFrame implements Runnable{
	public Clock() {
		setSize(500, 300);
		add(new Panel());
		setVisible(true);
		Thread t = new Thread(this);
		t.start();	
		}
	class Panel extends JPanel {
		Font f = new Font("Dialog", Font.BOLD, 90);
		public void paintComponent(Graphics g) {
			g.setFont(f);
			Calendar now = Calendar.getInstance();
			int hrs = now.get(Calendar.HOUR_OF_DAY);
			int min = now.get(Calendar.MINUTE);
			int sec = now.get(Calendar.SECOND);
			String time = hrs+":"+String.format("%02d:%02d", min, sec);
			g.drawString(time, 50, 100);
		}
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			repaint();
		}
	}
	
	public static void main(String[] args) {
		new Clock();

	}

}
