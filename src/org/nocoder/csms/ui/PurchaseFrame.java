package org.nocoder.csms.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PurchaseFrame extends BaseJFrame {
	private static final long serialVersionUID = -1456299737921732743L;

	public PurchaseFrame() {
		this.setTitle("进货管理");
		this.setContentPane(createContentPane());
	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel(new BorderLayout());
		pane.add(BorderLayout.NORTH, createInputPane());
		pane.add(BorderLayout.CENTER, createTablePane());
		pane.add(BorderLayout.SOUTH, createButtonPanel());
		return pane;
	}

	private JPanel createInputPane() {
		JPanel p = new JPanel(new GridLayout(1, 4));
		p.add(addInputPanel("批次名称"));
		p.add(addInputPanel("总成本"));
		p.add(addInputPanel("运费"));
		p.add(addInputPanel("备注"));
		return p;
	}

	private JPanel addInputPanel(String label) {
		JPanel panel = new JPanel(new BorderLayout(6, 0));
		panel.add(BorderLayout.WEST, new JLabel(label));
		JTextField textField = new JTextField();
		panel.add(BorderLayout.CENTER, textField);
		return panel;
	}

	private JPanel createTablePane() {
		final JScrollPane scrollPane = new JScrollPane();
		JPanel panel = new JPanel(new BorderLayout());
		JTable table = new JTable(2, 5);
		table.setGridColor(Color.BLACK);
		scrollPane.setViewportView(table);
		panel.add(scrollPane, BorderLayout.CENTER);
		return panel;
	}

	private JPanel createButtonPanel() {
		JPanel panel = new JPanel(new FlowLayout());
		JButton save = new JButton("保存");
		JButton close = new JButton("关闭");
		panel.add(save);
		panel.add(close);
		getRootPane().setDefaultButton(save);
		return panel;
	}

	public static void main(String[] args) {
		PurchaseFrame purchaseFrame = new PurchaseFrame();
		purchaseFrame.setVisible(true);
	}
}
