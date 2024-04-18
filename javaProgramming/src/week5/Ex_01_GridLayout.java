package week5;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_01_GridLayout extends JFrame{

	public Ex_01_GridLayout() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,3,3,5));
		
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		
		setTitle("GridLayout 연습");
		setVisible(true);
		
	}
	
	public static void main(String[]args) {
		   new Ex_01_GridLayout();
	}
}

