package com.myproject.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class mysqlTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://49.247.5.30/adup_project?serverTimezone=UTC"; // jdbc:mysql://127.0.0.1:3306/�������� ����� ��Ű���̸�
	private static final String USER = "adupProject"; //DB ����ڸ�
	private static final String PW = "adup1472";   //DB ����� ��й�ȣ
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println("����");
			System.out.println(con);
		}catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
	}
}
