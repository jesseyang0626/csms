package org.nocoder.csmc.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.nocoder.csmc.ui.CsmsFrame;
import org.nocoder.csmc.ui.LoginFrame;
import org.nocoder.csmc.ui.PurchaseFrame;
import org.nocoder.csmc.ui.SellFrame;

/**
 * 客户端控制器
 * 
 * @author Jason
 *
 */
public class Controller {

	/**
	 * 退出系统 控制逻辑
	 * 
	 * @param source
	 *            代表从哪一个界面退出. 是一个窗口的引用
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
		this.loginFrame.setVisible(false);
		this.csmsFrame.setVisible(true);
	}

	public void toPurchaseFrame() {
		this.csmsFrame.setVisible(false);
		this.purchaseFrame.setVisible(true);
	}

	public void toSellFrame() {
		this.csmsFrame.setVisible(false);
		this.sellFrame.setVisible(true);
	}

	private LoginFrame loginFrame;

	private CsmsFrame csmsFrame;

	private PurchaseFrame purchaseFrame;

	private SellFrame sellFrame;

	public LoginFrame getLoginFrame() {
		return loginFrame;
	}

	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	public CsmsFrame getCsmsFrame() {
		return csmsFrame;
	}

	public void setCsmsFrame(CsmsFrame csmsFrame) {
		this.csmsFrame = csmsFrame;
	}

	public SellFrame getSellFrame() {
		return sellFrame;
	}

	public void setSellFrame(SellFrame sellFrame) {
		this.sellFrame = sellFrame;
	}

	public PurchaseFrame getPurchaseFrame() {
		return purchaseFrame;
	}

	public void setPurchaseFrame(PurchaseFrame purchaseFrame) {
		this.purchaseFrame = purchaseFrame;
	}

}
