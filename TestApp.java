package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql:///abhidb","root","ab123");
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery("SELECT sid FROM student");
		while(res.next()) {
			System.out.println("Student Name - " + res.getString(1));
		}
		res.close();
		st.close();
		con.close();
	}

}
