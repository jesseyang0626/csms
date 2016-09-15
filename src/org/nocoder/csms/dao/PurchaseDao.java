package org.nocoder.csms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.nocoder.csms.entity.Purchase;
import org.nocoder.csms.util.DBUtil;
/**
 * 进货记录数据库访问对象
 * @author yangjinlong
 *
 */
public class PurchaseDao {
	public Purchase selectPurchaseById(String id){
		Connection conn = DBUtil.getConnection();
		String sql = "SELECT ID, BATCH_NAME , TOTAL_COST , EXPRESS_COST , CREATE_DATE , REMARK FROM PURCHASE WHERE ID=?";
		Purchase pur = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				pur = new Purchase();
				pur.setId(rs.getString("ID"));
				pur.setBatchName(rs.getString("BATCH_NAME"));
				pur.setTotalCost(rs.getDouble("TOTAL_COST"));
				pur.setExpressCost(rs.getDouble("EXPRESS_COST"));
				pur.setCreateDate(rs.getDate("CREATE_DATE"));
				pur.setRemark(rs.getString("REMARK"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeConnection(conn);
		return pur;
	}
	
	public List<Purchase> selectPurchaseList(){
		Connection conn = DBUtil.getConnection();
		String sql = "SELECT ID, BATCH_NAME , TOTAL_COST , EXPRESS_COST , CREATE_DATE , REMARK FROM PURCHASE ORDER BY CREATE_DATE";
		List<Purchase> purchaseList = new ArrayList<Purchase>();
		Purchase pur = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				pur = new Purchase();
				pur.setId(rs.getString("ID"));
				pur.setBatchName(rs.getString("BATCH_NAME"));
				pur.setTotalCost(rs.getDouble("TOTAL_COST"));
				pur.setExpressCost(rs.getDouble("EXPRESS_COST"));
				pur.setCreateDate(rs.getDate("CREATE_DATE"));
				pur.setRemark(rs.getString("REMARK"));
				purchaseList.add(pur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeConnection(conn);
		System.out.println("共有" + purchaseList.size() + "条进货记录");
		return purchaseList;
	}
	
	public int insertPurchase(Purchase purchase){
		Connection conn = DBUtil.getConnection();
		String sql = "INSERT INTO PURCHASE ("
				+ "ID, BATCH_NAME , TOTAL_COST , EXPRESS_COST , CREATE_DATE , REMARK "
				+ ") VALUES (?, ?, ?, ?, ?, ?)";
		int res = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, purchase.getId());
			ps.setString(2, purchase.getBatchName());
			ps.setDouble(3, purchase.getTotalCost());
			ps.setDouble(4, purchase.getExpressCost());
			ps.setDate(5, purchase.getCreateDate());
			ps.setString(6, purchase.getRemark());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeConnection(conn);
		if(res>0){
			System.out.println("添加进货记录成功");
		}
		return res;
	}
	
	public int updatePurchase(Purchase purchase){
		Connection conn = DBUtil.getConnection();
		String sql = "UPDATE PURCHASE BATCH_NAME=? , TOTAL_COST=? , EXPRESS_COST=? , CREATE_DATE=? , REMARK=? WHERE ID=? ";
		int res = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, purchase.getBatchName());
			ps.setDouble(2, purchase.getTotalCost());
			ps.setDouble(3, purchase.getExpressCost());
			ps.setDate(4, purchase.getCreateDate());
			ps.setString(5, purchase.getRemark());
			ps.setString(6, purchase.getId());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeConnection(conn);
		if(res>0){
			System.out.println("更新进货记录成功");
		}
		return res;
	}
	
	public int deletePurchaseById(String id){
		Connection conn = DBUtil.getConnection();
		String sql = "DELETE FROM PURCHASE WHERE ID=? ";
		int res = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			res = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeConnection(conn);
		
		if(res>0){
			System.out.println("删除进货记录成功");
		}
		return res;
	}
	
	
}
