package org.nocoder.csms.service;

import java.util.List;

import org.nocoder.csms.entity.Purchase;

public interface PurchaseService {

	public Purchase getPurchaseById(String id);

	public List<Purchase> getPurchaseList();

	public int savePurchase(Purchase pur);

	public int updatePurchaseById(Purchase pur);

	public int deletePurchaseById(String id);

}
