package org.lanqiao.msg.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBPool {
	//1、声明本身类型的对象。static。
	private static DBPool db = null;
	private DataSource ds = new ComboPooledDataSource();
	//2、私有化构造方法
	private DBPool(){}
	//3、定义方法用于获取本身对象
	public static DBPool getInstance(){
		if(null == db){
			db = new DBPool();
		}
		return db;
	}
	public Connection getConn() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
