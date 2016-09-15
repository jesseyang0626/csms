package org.nocoder.csms.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.nocoder.csms.controller.ClientUIController;

public class MainFrame extends BaseJFrame {
	private static final long serialVersionUID = 6892284721532573679L;

	public MainFrame() {
		this.setTitle("蓝氏服装销售管理系统");
		this.setContentPane(this.createContentPane());
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				controller.exit(MainFrame.this);
			}

		});
	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel(new BorderLayout());

		ImageIcon icon = new ImageIcon(this.getClass().getResource("title.png"));

		pane.add(BorderLayout.NORTH, new JLabel(icon));

		pane.add(BorderLayout.CENTER, createMenuPane());

		pane.add(BorderLayout.SOUTH, new JLabel("蓝氏服装销售管理系统V1.0 - 版权所有，盗版必究", JLabel.RIGHT));

		return pane;
	}

	private JPanel createMenuPane() {
		JPanel pane = new JPanel(new BorderLayout());
		// 务必将info 引用到界面控件对象
		info = new JLabel("蓝芳 您好!", JLabel.CENTER);

		pane.add(BorderLayout.NORTH, info);
		pane.add(BorderLayout.CENTER, createBtnPane());

		return pane;
	}

	private JPanel createBtnPane() {
		JPanel pane = new JPanel(new FlowLayout());
		JButton purchase = createImgBtn("purchase.png", "进货记录");
		JButton sell = createImgBtn("sell.png", "销售记录");
		JButton store = createImgBtn("store.png", "库存");
		JButton exit = createImgBtn("exit.png", "离开");

		pane.add(purchase);
		pane.add(sell);
		pane.add(store);
		pane.add(exit);

		// 默认按钮
		getRootPane().setDefaultButton(purchase);

		purchase.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.convertJFrame(controller.getMainFrame(), controller.getPurchaseFrame());
			}
		});

		sell.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.convertJFrame(controller.getMainFrame(), controller.getSellFrame());
			}
		});

		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.exit(MainFrame.this);
			}
		});

		return pane;
	}

	// 创建图片按钮的方法
	private JButton createImgBtn(String img, String txt) {
		ImageIcon ico = new ImageIcon(this.getClass().getResource(img));

		JButton button = new JButton(txt, ico);
		// button.setIcon(ico);
		// 垂直文本对齐位置
		button.setVerticalTextPosition(JButton.BOTTOM);
		// 水平文本对齐位置
		button.setHorizontalTextPosition(JButton.CENTER);

		return button;
	}

	private JLabel info;

	public void updateView() {
		info.setText(" 您好!");
	}

	private ClientUIController controller;

	public ClientUIController getController() {
		return controller;
	}

	public void setClientUIController(ClientUIController controller) {
		this.controller = controller;
	}

}
