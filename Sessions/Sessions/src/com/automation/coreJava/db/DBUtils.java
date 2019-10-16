package com.automation.coreJava.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* This example shows how to execute database query */
class DBUtils {

	public static void executeQuery() {
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root","srikrishna");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from country");
			while(resultSet.next()){
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
			}
		} catch (Exception exception) {
			System.out.println("Exception:" + exception);
		} finally {
			try {
				if (statement != null) {
					statement = null;
				}
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException sqlException) {
				System.out.println("Exception:" + sqlException);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		executeQuery();
	}

}
