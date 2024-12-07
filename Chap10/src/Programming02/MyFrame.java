package Programming02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{

	private JLabel label1, label2, label3;
	private JTextField jt1, jt2, jt3;
	private JButton jb1, jb2;
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== jb1) {
				int i = Integer.parseInt(jt1.getText());
				int j = Integer.parseInt(jt2.getText());
				jt3.setText(i+j+"");
			}
			if(e.getSource()== jb2) {
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
			}
		}
	}
	public MyFrame() {
		setSize(500,300);
		setLayout(new FlowLayout());
		label1 = new JLabel("  first integer:    ");
		label2 = new JLabel("second integer:");
		label3 = new JLabel("           result:      ");
		jt1 = new JTextField(30);
		jt2 = new JTextField(30);
		jt3 = new JTextField(30);
		jb1 = new JButton("add");
		jb2 = new JButton("clear");	
		jt1.addActionListener(new MyListener());
		jt2.addActionListener(new MyListener());
		jt3.addActionListener(new MyListener());
		jb1.addActionListener(new MyListener());
		jb2.addActionListener(new MyListener());
		add(label1);
		add(jt1);
		add(label2);
		add(jt2);
		add(label3);
		add(jt3);
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
