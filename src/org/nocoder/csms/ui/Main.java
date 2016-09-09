package org.nocoder.csms.ui;

import org.nocoder.csms.controller.Controller;

/**
 * 程序入口
 * 
 * @author Jason Yang
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 客户端控制器
		Controller controller = new Controller();

		// 登录界面
		LoginFrame loginFrame = new LoginFrame();

		// 主界面
		CsmsFrame csmsFrame = new CsmsFrame();

		PurchaseFrame purchaseFrame = new PurchaseFrame();

		SellFrame sellFrame = new SellFrame();

		controller.setLoginFrame(loginFrame);
		controller.setCsmsFrame(csmsFrame);
		controller.setSellFrame(sellFrame);
		controller.setPurchaseFrame(purchaseFrame);

		loginFrame.setController(controller);
		loginFrame.setVisible(true);

		csmsFrame.setController(controller);
	}

}
