package org.nocoder.csms.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.nocoder.csms.controller.ClientUIController;

public class SellFrame extends BaseJFrame {

	private static final long serialVersionUID = 7806680704413478071L;

	public SellFrame() {
		this.setTitle("销售管理");
		this.setContentPane(createContentPane());
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				clientUIController.convertJFrame(clientUIController.getSellFrame(), clientUIController.getMainFrame());;
			}

		});
		
	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel(new BorderLayout());

		pane.add(BorderLayout.NORTH, createInputPane());

		pane.add(BorderLayout.SOUTH, new JLabel("蓝氏服装销售管理系统V1.0 - 版权所有，盗版必究", JLabel.RIGHT));

		return pane;
	}

	private JPanel createInputPane() {
		JPanel inputPanel = new JPanel(new FlowLayout());
		return inputPanel;
	}
	
	private ClientUIController clientUIController;

	public void setClientUIController(ClientUIController clientUIController) {
		this.clientUIController = clientUIController;
	}
	

}
