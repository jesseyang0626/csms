package org.nocoder.csms.entity;

import java.sql.Date;
/**
 * 进货信息实体类
 * @author yangjinlong
 *
 */
public class Purchase {
	private String id;
	private String batchName;
	private double totalCost;
	private double expressCost;
	private Date createDate;
	private String remark;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public double getExpressCost() {
		return expressCost;
	}
	public void setExpressCost(double expressCost) {
		this.expressCost = expressCost;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
