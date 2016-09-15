package org.nocoder.csms.service.impl;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import org.nocoder.csms.dao.PurchaseDao;
import org.nocoder.csms.entity.Purchase;
import org.nocoder.csms.service.PurchaseService;

public class PurchaseServiceImpl implements PurchaseService{
	
	private PurchaseDao purchaseDao = new PurchaseDao();

	@Override
	public Purchase getPurchaseById(String id) {
		return purchaseDao.selectPurchaseById(id);
	}

	@Override
	public List<Purchase> getPurchaseList() {
		return purchaseDao.selectPurchaseList();
	}

	@Override
	public int savePurchase(Purchase pur) {
		pur.setId(UUID.randomUUID().toString().replace("-", ""));
		pur.setCreateDate(new Date(System.currentTimeMillis()));
		return purchaseDao.insertPurchase(pur);
	}

	@Override
	public int updatePurchaseById(Purchase pur) {
		return purchaseDao.updatePurchase(pur);
	}

	@Override
	public int deletePurchaseById(String id) {
		return purchaseDao.deletePurchaseById(id);
	}

}
