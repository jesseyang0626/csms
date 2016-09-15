package org.nocoder.csms.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.nocoder.csms.controller.ClientUIController;
import org.nocoder.csms.controller.PurchaseController;
import org.nocoder.csms.entity.Purchase;

public class PurchaseFrame extends BaseJFrame {
	private static final long serialVersionUID = -1456299737921732743L;

	public PurchaseFrame() {
		this.setTitle("进货管理");
		this.setContentPane(createContentPane());
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				clientUIController.fromPurchaseFrameToCsmsFrame();
			}

		});
	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel(new BorderLayout());
		pane.add(BorderLayout.NORTH, createInputPane());
		pane.add(BorderLayout.CENTER, createTablePane());
		pane.add(BorderLayout.SOUTH, createButtonPanel());
		return pane;
	}

	private JPanel createInputPane() {
		JPanel inputPanel = new JPanel(new GridLayout(1, 4));
		
		JPanel batchNamePanel = new JPanel(new BorderLayout(6, 0));
		batchNamePanel.add(BorderLayout.WEST, new JLabel("*批次名称"));
		batchName = new JTextField();
		batchNamePanel.add(BorderLayout.CENTER, batchName);
		
		JPanel totalCostPanel = new JPanel(new BorderLayout(6, 0));
		totalCostPanel.add(BorderLayout.WEST, new JLabel("*总成本"));
		totalCost = new JTextField();
		totalCostPanel.add(BorderLayout.CENTER, totalCost);
		
		JPanel expressCostPanel = new JPanel(new BorderLayout(6, 0));
		expressCostPanel.add(BorderLayout.WEST, new JLabel("*运费"));
		expressCost = new JTextField("0.00");
		expressCostPanel.add(BorderLayout.CENTER, expressCost);
		
		JPanel remarkPanel = new JPanel(new BorderLayout(6, 0));
		remarkPanel.add(BorderLayout.WEST, new JLabel("备注"));
		remark = new JTextField();
		remarkPanel.add(BorderLayout.CENTER, remark);
		
		inputPanel.add(batchNamePanel);
		inputPanel.add(totalCostPanel);
		inputPanel.add(expressCostPanel);
		inputPanel.add(remarkPanel);
		return inputPanel;
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
		JButton saveBtn = new JButton("保存");
		saveBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String batchNameStr = batchName.getText();
				if(batchNameStr == null || "".equals(batchNameStr)){
					System.out.println("批次名称不能为空");
					return;
				}
				
				String totalCostStr = totalCost.getText();
				if(totalCostStr == null || "".equals(totalCostStr)){
					System.out.println("本次总成本不能为空");
					return;
				}
				
				Purchase pur = new Purchase();
				pur.setBatchName(batchNameStr);
				pur.setTotalCost(Double.valueOf(totalCostStr));
				pur.setExpressCost(Double.valueOf(expressCost.getText()));
				pur.setRemark(remark.getText());
				purchaseController.savePurchase(pur);
			}
		});
		
		JButton closeBtn = new JButton("关闭");
		closeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clientUIController.fromPurchaseFrameToCsmsFrame();
				
			}
		});
		
		panel.add(saveBtn);
		panel.add(closeBtn);
		getRootPane().setDefaultButton(saveBtn);
		return panel;
	}

	public static void main(String[] args) {
		PurchaseFrame purchaseFrame = new PurchaseFrame();
		purchaseFrame.setVisible(true);
	}
	
	private JTextField batchName = null;
	private JTextField totalCost = null;
	private JTextField expressCost = null;
	private JTextField remark = null;
	
	private ClientUIController clientUIController;

	public void setClientUIController(ClientUIController controller) {
		this.clientUIController = controller;
	}
	
	private PurchaseController purchaseController;

	public void setPurchaseController(PurchaseController purchaseController) {
		this.purchaseController = purchaseController;
	}
	
	
}
