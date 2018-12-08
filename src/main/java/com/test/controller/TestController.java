package com.test.controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.controller.AbstractController;
import com.example.model.ExampleUser;
import com.example.model.ExampleUserToy;

import core.jdbc.mysql.DBQuery;
import core.jdbc.mysql.WhereRelation;

@Controller
@RequestMapping("/test")
public class TestController extends AbstractController {
	// 入力检查
	@Override
	public void check(HttpServletRequest request, HttpServletResponse response) {
	}

	//
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
	}

	@Override
	public void afterCheck(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String defaultAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/user/{user_id}")
	public String queryUser(@PathVariable("user_id") int user_id, ModelMap model) {
		ExampleUser user = new ExampleUser();
		user.setUser_id(user_id);
		user.setUser_name("zhaoyang");
		model.addAttribute("user", user);
		return "user_overview";
	}

	public void test() {
		String[] locations_id = { "ss", "110107", "110108" };

		String aa = Arrays.toString((String[]) locations_id);
		System.out.println(aa);
		String[] locations_ids = { "1111", "110107", "110108" };

		aa = Arrays.toString((String[]) locations_ids);
		System.out.println(aa);

		int[] a1 = { 1, 2, 3, 4 };
		System.out.println(a1.getClass().getName());
		// 打印出的数组类的名字为[I

		Long[] a2 = { (long) 1, (long) 2, (long) 3, (long) 4 };
		System.out.println(a2.getClass().getName());
		// 打印出的数组类的名字为[I

		String[] s = new String[2];
		System.out.println(s.getClass().getName());
		// 打印出的数组类的名字为 [Ljava.lang.String;

		String[][] ss = new String[2][3];
		System.out.println(ss.getClass().getName());
	}

	@RequestMapping(value = "/testDB")
	public void testDB() {
		//
		try {
			String jdbcDsn = "test";
			HashMap<String, Object> whereSQL = new HashMap<String, Object>();
			whereSQL.put("user_id", "2");

			WhereRelation whereRelation = new WhereRelation();
			whereRelation.where(whereSQL);
			List<Map<String, Object>> DDIV = DBQuery.instance(jdbcDsn).table("ExampleUser").getList(whereRelation);
			if (DDIV != null) {
				logger.info(DDIV.size()+"");
				if (DDIV.size() > 0)
					logger.info(DDIV.get(0).get("user_id")+"");
			}
			ExampleUser user = DBQuery.instance(jdbcDsn).table(ExampleUser.class).getEntity(whereRelation);
			if (user != null)
				System.out.println(user.getUser_id());

			HashMap<String, Object> insertData = new HashMap<String, Object>();
			insertData.put("user_name", "1122");
			insertData.put("password", "111111");
			DBQuery.instance(jdbcDsn).table("ExampleUser").insert(insertData);

			HashMap<String, Object> updateData = new HashMap<String, Object>();
			updateData.put("user_name", "11223333");
			updateData.put("password", "111111");
			DBQuery.instance(jdbcDsn).table("ExampleUser").update(updateData, whereRelation);

			DBQuery.instance(jdbcDsn).table("ExampleUser").update(updateData, whereRelation);
			updateData.put("user_name", "11223333'");
			DBQuery.instance(jdbcDsn).table("ExampleUser").update(updateData, whereRelation);

			DDIV = DBQuery.instance(jdbcDsn).table("ExampleUser").getList(whereRelation);

			List<ExampleUser> ss = DBQuery.instance(jdbcDsn).table(ExampleUser.class).getEntityList(whereRelation);
			if (ss.size() > 0)
				logger.info(ss.get(0).getUser_name());

			ExampleUser aaa = new ExampleUser();
			aaa.setPassword("111");
			aaa.setUser_name("233");
			DBQuery.instance(jdbcDsn).insertObject(aaa);

			ExampleUserToy userToy = new ExampleUserToy();
			userToy.setToy_id(core.util.Encrypt.getRandomUUID());
			userToy.setToy_name("111");

			DBQuery.instance(jdbcDsn).insertObject(userToy);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info(e.getMessage(), e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info(e.getMessage(), e);
		}
	}

}
