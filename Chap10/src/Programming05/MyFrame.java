package Programming05;

import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	JButton button;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    
    public MyFrame() {
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("이자 계산기");

        JPanel panel1 = new JPanel();

        JLabel label1 = new JLabel("원금을 입력하시오:");
        JLabel label2 = new JLabel("이율을 입력하시오:");
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(15);
        button = new JButton("변환");
        button.addActionListener(new MyListener());

        t3.setEditable(false);
        panel1.add(label1);
        panel1.add(t1);
        panel1.add(label2);
        panel1.add(t2);
        panel1.add(button);
        panel1.add(t3);

        this.add(panel1);

        setVisible(true);
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                int t = Integer.parseInt(t1.getText());
                float a = Float.parseFloat(t2.getText());
                int k = (int) (t * (a / 100));
                t3.setText("이자는 " + k + " 만원이 됩니다.");
            }
        }
    }
	public static void main(String[] args) {
		 MyFrame f = new MyFrame();
	}
}
