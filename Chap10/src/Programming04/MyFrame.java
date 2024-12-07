package Programming04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JButton button;
	JTextField t1;
	JTextField t2;
	
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
                try {
                    int t = Integer.parseInt(t1.getText());
                    double k = t * 1.609344;
                    t2.setText(t + " 마일은 " + String.format("%.2f", k) + " 킬로미터입니다."); // 결과 포맷팅
                } catch (NumberFormatException ex) {
                    t2.setText("올바른 숫자를 입력하세요!");
                }
            }
		}
	}
	public MyFrame(){
		setSize(250, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mile->Km");
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("마일을 입력하시오");
		t1 = new JTextField(5);
		t2 = new JTextField(20);
		button = new JButton("변환");
		button.addActionListener(new MyListener());
		
		t2.setEditable(false);
		panel1.add(label);
		panel1.add(t1);
		panel1.add(button);
		panel1.add(t2);
		this.add(panel1);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
