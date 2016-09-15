package org.nocoder.csms.entity;

import java.sql.Date;

public class PurchaseDetail {
	private String id;
	private String purchaseId;
	private Date purchaseDate;
	private String type;
	private int quantity;
	private double purchasePrice;
	private String sourceOfGoods;
	private double totlaPrice;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getSourceOfGoods() {
		return sourceOfGoods;
	}
	public void setSourceOfGoods(String sourceOfGoods) {
		this.sourceOfGoods = sourceOfGoods;
	}
	public double getTotlaPrice() {
		return totlaPrice;
	}
	public void setTotlaPrice(double totlaPrice) {
		this.totlaPrice = totlaPrice;
	}
	
	
}
