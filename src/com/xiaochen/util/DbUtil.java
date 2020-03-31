package com.xiaochen.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/stu?useSSL=false&characterEncoding=utf-8&serverTimezone=UTC"; // 数据库连接地址
	private String dbUserName="root"; // 用户名
	private String dbPassword="123456"; // 密码
	private String jdbcName="com.mysql.cj.jdbc.Driver"; // 驱动名称
    //连接数据库
	public Connection getCon(){
		try {
			Class.forName(jdbcName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	//关闭数据库
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	//测试数据库
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("数据库连接成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
	}

}
