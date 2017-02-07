package com.zpy.j2se;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JButton jButton = new JButton();
		jButton.addActionListener(event -> System.out.println("world"));
		jFrame.add(jButton);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
