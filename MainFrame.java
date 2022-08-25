package test4;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	MyKeyAdapter key;
	JPanel panel;
	JLabel label;
	
	public MainFrame() {
		this.setSize(400,200);
		this.key = new MyKeyAdapter();
		
		this.panel = new JPanel();
		this.panel.setBackground(Color.gray);
		this.label = new JLabel("LOVE");
		this.label.setSize(200,50);
		this.label.setFont(new Font("Arial", Font.PLAIN,30));
		this.addKeyListener(this.key);
		this.panel.add(this.label);
		
		this.add(this.panel);		
	}
	public class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Font f = label.getFont();
			int size = f.getSize();
			System.out.println(size);
			
			if(e.getKeyCode()==61) {
				label.setFont(new Font("Arial", Font.PLAIN, size+5));
				panel.setBackground(Color.gray);
			}
			else if(e.getKeyCode()==45) {
				if(size>5) {
					label.setFont(new Font("Arial", Font.PLAIN,size-5));
				}
				else {
					label.setFont(new Font("Arial", Font.PLAIN, size));
					panel.setBackground(Color.red);
				}
			}
		}
	}
}
