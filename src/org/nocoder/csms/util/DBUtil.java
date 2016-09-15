package org.nocoder.csms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * 数据库操作工具类
 * @author yangjinlong
 *
 */
public class DBUtil {

	public static void main(String[] args) {
		Connection conn = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      conn = DriverManager.getConnection("jdbc:sqlite:"+ System.getProperty("user.dir") +"/database/csms.db");
	      String sql = "CREATE TABLE COMPANY " +
                  "(ID INT PRIMARY KEY     NOT NULL," +
                  " NAME           TEXT    NOT NULL, " + 
                  " AGE            INT     NOT NULL, " + 
                  " ADDRESS        CHAR(50), " + 
                  " SALARY         REAL)"; 
	      PreparedStatement ps = conn.prepareStatement(sql);
	      ps.execute();
	      ps.close();
	      conn.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
	}

}
