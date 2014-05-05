package gui_1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Main extends JFrame{
	
	private JPanel jPanel1 = new JPanel();
	private JButton jButton1 = new JButton();
	private JTextField jTextfield1 = new JTextField();
	
	public Main(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		this.jPanel1.setLayout(new FlowLayout());
		
		this.jTextfield1.setText("Inhalt XYZ");
		this.jTextfield1.setPreferredSize(new Dimension(300,20));
		
		this.jButton1.setText("Reset");
		this.jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jButtonactionPerformed(arg0);
			}
		});
		
		this.jPanel1.add(this.jTextfield1);
		this.jPanel1.add(this.jButton1);
		
		this.getContentPane().add(this.jPanel1);
		this.setSize(500, 300);
		
		this.setVisible(true);
	}
	
	public void jButtonactionPerformed(ActionEvent arg0){
		this.jTextfield1.setText("");
	}

	public static void main(String[] args) {
		new Main();
	}

}
