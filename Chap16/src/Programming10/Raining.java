package Programming10;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Rain{
	int x, y;
	public Rain(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Raining extends JFrame implements Runnable {
	ArrayList<Rain> list = new ArrayList<>();
	public Raining() {
		for(int i=0; i<30; i++) {
			int x = (int)(Math.random()*1000);
			int y = (int)(Math.random()*100);
			list.add(new Rain(x,y));
		}
		setSize(1000,600);
		add(new Raining());
		setVisible(true);
		Thread t = new Thread(this);
		t.start();
	}
	
	class Panel extends JPanel {
		public void paintComponent(Graphics g) {
			for(int i=0; i<list.size(); i++) {
				Rain r = list.get(i);
				g.fillOval(r.x, r.y,5,10);
			}
		}

	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
				for(int i=0; i<list.size(); i++) {
					Rain r = list.get(i);
					r.y += 10;
//					list.add(i, r);
				}
				repaint();
			}catch(InterruptedException e) {}
		}
	}
	public static void main(String[] args) {
		new Raining();
	}

}
