package Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class MyClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
}

public class CallbackTest {
    public static void main(String[] args) {
        ActionListener listener = new MyClass();
        Timer t = new Timer(1000, listener);
        t.start();
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /* 람다식 사용
    	Timer t = new Timer(1000, event -> System.out.println("beep"));
        t.start();

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */
    	
    }
}
