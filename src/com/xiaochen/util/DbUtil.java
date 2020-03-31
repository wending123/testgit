package com.xiaochen.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/stu?useSSL=false&characterEncoding=utf-8&serverTimezone=UTC"; // ���ݿ����ӵ�ַ
	private String dbUserName="root"; // �û���
	private String dbPassword="123456"; // ����
	private String jdbcName="com.mysql.cj.jdbc.Driver"; // ��������
    //�������ݿ�
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
	//�ر����ݿ�
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	//�������ݿ�
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("���ݿ����ӳɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}

}
