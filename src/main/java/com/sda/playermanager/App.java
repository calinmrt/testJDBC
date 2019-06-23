package com.sda.playermanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	private static final Logger log = LogManager.getLogger(App.class);
	private static final String dbUrl = "jdbc:mysql://localhost:3306/users";
	private static final String dbUser = "root";
	private static final String dbPass = "root";

	public static void main(String[] args) {
		log.info("main():IN:");

		log.info("main():OUT:");
	}

	public void parseAllPlayers() {
		log.info("parseAllPlayes(): IN:");
		try {
			Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select 1");

		} catch (SQLException e) {
			
		}
	}
}
