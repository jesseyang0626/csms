package org.nocoder.csms.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class BaseJFrame extends JFrame{
	private static final long serialVersionUID = -1689692851017308790L;

	public BaseJFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHight / 2);
		this.setLocationRelativeTo(null);
	}
}
