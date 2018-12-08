import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.OTA.config.Config;
import com.OTA.model.Entity.Hotel;
import com.example.model.ExampleUser;
import com.example.model.ExampleUserToy;

import core.jdbc.mysql.DBQuery;
import core.jdbc.mysql.WhereRelation;

/**
 * @author admin
 *
 */
public class Example {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		//
		
		
		
		HashMap<String, Object> whereSQLHotel = new HashMap<String, Object>();
		whereSQLHotel.put("hotel_id", 5);
		WhereRelation whereRelation = new WhereRelation();
		Hotel hotel = DBQuery.instance(Config.pmsDsn).table(Hotel.class).getEntity(whereRelation.where(whereSQLHotel));
		
		System.out.println(hotel.getHotel_address());
		
		String jdbcDsn = "test";
		
		HashMap<String, Object> insertData = new HashMap<String, Object>();
		insertData.put("user_name", "1122");
		insertData.put("password", "111111");
		DBQuery.instance(jdbcDsn).table("ExampleUser").insert(insertData);
		
		insertData.put("user_name", "3333");
		insertData.put("password", "111111");
		Object id = DBQuery.instance(jdbcDsn).table("ExampleUser").insertIdEntity(insertData);
		System.out.println("insertIdEntity insertData :id->"+id);
		
		
		HashMap<String, Object> whereSQL = new HashMap<String, Object>();
		whereSQL.put("user_id", "2");
		
		WhereRelation.instance("user_id_2").where(whereSQL);
		
		List<Map<String, Object>> DDIV = DBQuery.instance(jdbcDsn).table("ExampleUser").getList(WhereRelation.instance("user_id_2"));
		System.out.println(DDIV.size());
		if(DDIV.size() > 0) {
			System.out.println(DDIV.get(0).get("user_id"));
			System.out.println(DDIV.get(0).get("user_name"));
		}
		
		
		ExampleUser user = DBQuery.instance(jdbcDsn).table(ExampleUser.class).getEntity(WhereRelation.instance("user_id_2"));
		if(user != null) {
			System.out.println("getEntity:"+user.getUser_id());
		}
		
		HashMap<String, Object> updateData = new HashMap<String, Object>();
		updateData.put("user_name", "11223333");
		updateData.put("password", "111111");
		
		WhereRelation.instance("update_2").where(whereSQL);
		
		DBQuery.instance(jdbcDsn).table("ExampleUser").update(updateData, WhereRelation.instance("update_2"));
		
		whereSQL.put("user_id", "1");
		WhereRelation.instance("update_1").where(whereSQL);
		DBQuery.instance(jdbcDsn).table("ExampleUser").update(updateData, WhereRelation.instance("update_1"));
		updateData.put("user_name", "11111'");
		DBQuery.instance(jdbcDsn).table("ExampleUser").update(updateData, WhereRelation.instance("update_1"));
		
		DDIV = DBQuery.instance(jdbcDsn).table("ExampleUser").getList();
		
		WhereRelation.instance("update_1").where(whereSQL);
		List<ExampleUser> ss = DBQuery.instance(jdbcDsn).table(ExampleUser.class).getEntityList(WhereRelation.instance("update_1"));
		if(ss.size() > 0) {
			System.out.println("getEntityList:" + ss.get(0).getUser_name());
		}
		
		ExampleUser aaa = new ExampleUser();
		aaa.setPassword("111");
		aaa.setUser_name("233");
		DBQuery.instance(jdbcDsn).insertObject(aaa);
		
		ExampleUserToy userToy = new ExampleUserToy();
		userToy.setToy_id(core.util.Encrypt.getRandomUUID());
		userToy.setToy_name("111");
		Object IDs = DBQuery.instance(jdbcDsn).insertIdEntity(userToy);
		System.out.println("insertIdEntity object:id->"+IDs); 
		
		//BatchUpdate
		HashMap<String, Object> whereSQLUser = new HashMap<String, Object>();
		whereSQLUser.put("user_id", "2");
		HashMap<String, String> updateDataUser = new HashMap<String, String>();
		updateDataUser.put("user_name", "BatchUpdate3434343");
		updateDataUser.put("password", "111111");
		
		//DBQuery.instance(jdbcDsn).table("ExampleUser").setUpdateData(updateDataUser).setBatchUpdateSql();
		//DBQuery.instance(jdbcDsn).executeBatchUpdate();
		
		HashMap<String, Object> whereSQLUser2 = new HashMap<String, Object>();
		whereSQLUser2.put("user_id", "1");
		HashMap<String, String> updateDataUser2 = new HashMap<String, String>();
		updateDataUser2.put("user_name", "BatchUpdate5656565");
		updateDataUser2.put("password", "111111");
		//DBQuery.instance(jdbcDsn).table("ExampleUser").where(whereSQLUser2).setUpdateData(updateDataUser2).setBatchUpdateSql();
		
		//DBQuery.instance(jdbcDsn).executeBatchUpdate();
		
		
	}

}
