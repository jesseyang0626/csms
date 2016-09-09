package org.nocoder.csms.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PurchaseFrame extends JFrame {
	private static final long serialVersionUID = -1456299737921732743L;

	public PurchaseFrame() {
		this.setTitle("进货管理");
		this.setSize(780, 480);
		this.setLocationRelativeTo(null);

		this.setContentPane(createContentPane());
	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel(new BorderLayout());

		pane.add(BorderLayout.NORTH, createInputPane());

		// pane.add(BorderLayout.CENTER, createTablePane());

		pane.add(BorderLayout.SOUTH, new JLabel("蓝氏服装销售管理系统V1.0 - 版权所有，盗版必究", JLabel.RIGHT));

		return pane;
	}

	private JPanel createInputPane() {
		JPanel p = new JPanel(new GridLayout(2, 2, 6, 6));
		p.add(createIdPane());
		p.add(createIdPane());
		p.add(createIdPane());
		p.add(createIdPane());
		return p;
	}

	/**
	 * 批次名称
	 * 
	 * @return
	 */
	private JPanel createIdPane() {
		JPanel p = new JPanel(new BorderLayout(6, 0));
		p.add(BorderLayout.WEST, new JLabel("批次名称:"));
		JTextField idField = new JTextField();
		idField.setText("lanfang");
		p.add(BorderLayout.CENTER, idField);
		// 将实例变量idField 引用到界面控件上
		// this.idField = idField;
		return p;
	}
}
