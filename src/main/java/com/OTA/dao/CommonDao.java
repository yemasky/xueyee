package com.OTA.dao;

import java.sql.SQLException;

import com.OTA.config.Config;

import core.jdbc.mysql.DBQuery;

public class CommonDao {
	public static CommonDao instance() {
		return new CommonDao();
	}
	
	public void closeAllConnection() throws SQLException {
		DBQuery.instance(Config.pmsDsn).closeConnection();
		DBQuery.instance(Config.otaDsn).closeConnection();
		DBQuery.instance(Config.smartDsn).closeConnection();
	}
}
