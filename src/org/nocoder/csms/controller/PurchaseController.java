package org.nocoder.csms.controller;

import org.nocoder.csms.entity.Purchase;
import org.nocoder.csms.service.PurchaseService;
import org.nocoder.csms.service.impl.PurchaseServiceImpl;

public class PurchaseController {
	private PurchaseService service = new PurchaseServiceImpl();
	
	public int savePurchase(Purchase pur){
		return service.savePurchase(pur);
	}
	public int updatePurchaseById(Purchase pur){
		return service.updatePurchaseById(pur);
	}
	public int deletePurchaseById(String id){
		return service.deletePurchaseById(id);
	}
	public Purchase getPurchaseById(String id){
		return service.getPurchaseById(id);
	}
}
