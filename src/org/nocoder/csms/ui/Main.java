package org.nocoder.csms.ui;

import org.nocoder.csms.controller.ClientUIController;
import org.nocoder.csms.controller.PurchaseController;

/**
 * 程序入口
 * 
 * @author Jason Yang
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 客户端界面控制器
		ClientUIController clientUIController = new ClientUIController();

		// 登录界面
		LoginFrame loginFrame = new LoginFrame();
		loginFrame.setClientUIController(clientUIController);
		loginFrame.setVisible(true);
		
		// 主界面
		MainFrame mainFrame = new MainFrame();
		mainFrame.setClientUIController(clientUIController);
		
		// 进货记录界面
		PurchaseFrame purchaseFrame = new PurchaseFrame();
		purchaseFrame.setClientUIController(clientUIController);
		purchaseFrame.setPurchaseController(new PurchaseController());
		
		// 销售记录界面
		SellFrame sellFrame = new SellFrame();
		sellFrame.setClientUIController(clientUIController);
		
		clientUIController.setLoginFrame(loginFrame);
		clientUIController.setMainFrame(mainFrame);
		clientUIController.setSellFrame(sellFrame);
		clientUIController.setPurchaseFrame(purchaseFrame);
		
	}

}
