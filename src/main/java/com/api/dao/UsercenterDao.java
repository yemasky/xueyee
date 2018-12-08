package com.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import core.jdbc.mysql.DBQuery;
import core.jdbc.mysql.WhereRelation;

public class UsercenterDao {
	public static List<Map<String, Object>> login(String loginname, String userPassword) throws SQLException {
		HashMap<String, Object> whereCondition = new HashMap<String, Object>();
		whereCondition.put("login_name", loginname);
		WhereRelation.instance("login_name").where(whereCondition);
		List<Map<String, Object>> userInfo = DBQuery.instance("usercenter").table("itcast_user").getList(WhereRelation.instance("login_name"));
		return userInfo;
	}
}
