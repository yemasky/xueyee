package com.OTA.dao;

import com.OTA.config.Config;
import com.OTA.model.Entity.Ota_direct_log;

import core.jdbc.mysql.DBQuery;

public class OtaDao {
	public static Long saveDirectLog(Ota_direct_log ota_direct_log) throws Exception {
		return (Long) DBQuery.instance(Config.otaDsn).insertIdEntity(ota_direct_log);
	}
	
}
