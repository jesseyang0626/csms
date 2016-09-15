package org.nocoder.csms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 数据库操作工具类
 * @author yangjinlong
 *
 */
public class DBUtil {
	/**
	 * 获取数据库连接对象，链接到csms.db数据库
	 * @return connection
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:"+ System.getProperty("user.dir") +"/database/csms.db");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;	
	}
	
	/**
	 * 关闭数据库连接
	 * @param conn
	 */
	public static void closeConnection(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
