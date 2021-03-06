package org.nocoder.csms.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.nocoder.csms.ui.MainFrame;
import org.nocoder.csms.ui.LoginFrame;
import org.nocoder.csms.ui.PurchaseFrame;
import org.nocoder.csms.ui.SellFrame;

/**
 * 客户端界面控制器
 * 
 * @author Jason Yang
 *
 */
public class ClientUIController {

	/**
	 * 退出系统 控制逻辑
	 * @param source 代表从哪一个界面退出. 是一个窗口的引用
	 *  
	 */
	public void exit(JFrame frame) {
		// Confirm 确认
		// Dialog 对话框
		int val = JOptionPane.showConfirmDialog(frame, "确定要退出吗?");
		if (val == JOptionPane.YES_OPTION) {
			System.exit(0);// 结束当前Java进程
		}
	}

	public void login() {
		convertJFrame(loginFrame, mainFrame);
	}

	/**
	 * 界面切换
	 * @param a 关闭原界面
	 * @param b 打开目标界面
	 */
	public void convertJFrame(JFrame a, JFrame b){
		a.setVisible(false);
		b.setVisible(true);
	}
	

	private LoginFrame loginFrame;

	private MainFrame mainFrame;

	private PurchaseFrame purchaseFrame;

	private SellFrame sellFrame;

	public LoginFrame getLoginFrame() {
		return loginFrame;
	}

	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public PurchaseFrame getPurchaseFrame() {
		return purchaseFrame;
	}

	public void setPurchaseFrame(PurchaseFrame purchaseFrame) {
		this.purchaseFrame = purchaseFrame;
	}

	public SellFrame getSellFrame() {
		return sellFrame;
	}

	public void setSellFrame(SellFrame sellFrame) {
		this.sellFrame = sellFrame;
	}


}
