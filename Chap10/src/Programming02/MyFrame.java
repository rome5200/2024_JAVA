package Programming02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	 private JLabel label1, label2, label3;
	   private JTextField jt1, jt2, jt3;
	   private JButton button1, button2;
	   
	   public MyFrame() {
	      setSize(500, 200);
	      setLayout(new FlowLayout());
	      
	      label1 = new JLabel("first integer : ");
	      label2 = new JLabel("second integer : ");
	      label3 = new JLabel("result : ");
	      jt1 = new JTextField(30);
	      jt2 = new JTextField(30);
	      jt3 = new JTextField(30);
	      button1 = new JButton("add");
	      button2 = new JButton("clear");
	      jt1.addActionListener(this);
	      jt2.addActionListener(this);
	      jt3.addActionListener(this);
	      button1.addActionListener(this);
	      button2.addActionListener(this);
	      add(label1); add(jt1);
	      add(label2); add(jt2);
	      add(label3); add(jt3);
	      add(button1); add(button2);
	      setVisible(true);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	   }
	   
	   @Override
	   public void actionPerformed(ActionEvent e) {
	      if(e.getSource() == button1) {
	         int i = Integer.parseInt(jt1.getText());
	         int j = Integer.parseInt(jt2.getText());
	         jt3.setText(i+j +"");
	      }
	      if(e.getSource() == button2) {
	         jt1.setText("");
	         jt2.setText("");
	         jt3.setText("");
	      }
	   }
	   public static void main(String[] args) {
	      new MyFrame();
	   }
	}
