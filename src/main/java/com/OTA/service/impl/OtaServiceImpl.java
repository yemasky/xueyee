package com.OTA.service.impl;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.OTA.dao.OtaDao;
import com.OTA.model.Entity.Ota_direct_log;
import com.OTA.service.OtaService;

public class OtaServiceImpl implements OtaService {
	protected static Logger logger = LoggerFactory.getLogger(OtaServiceImpl.class);
	
	@Override
	public Long saveDirectLog(Ota_direct_log ota_direct_log) throws Exception {
		// TODO Auto-generated method stub
		return OtaDao.saveDirectLog(ota_direct_log);
	}
	
	public static OtaServiceImpl instent() {
		return new OtaServiceImpl();
	}
	
	/*
	 * 保存直连请求日志
	 */
	public void saveDirectLog(int hotel_id, String function, String title, String reques, String result) {
		Ota_direct_log otaDirectLog = new Ota_direct_log();
		otaDirectLog.setHotel_id(hotel_id);
		otaDirectLog.setExecute_function(function);
		otaDirectLog.setExecute_title(title);
		otaDirectLog.setOta_request(reques);
		//
		Timestamp add_datetime = new Timestamp(System.currentTimeMillis());
		otaDirectLog.setAdd_datetime(add_datetime);
		otaDirectLog.setOta_result(result);
		try {
			this.saveDirectLog(otaDirectLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
	}
	
}
