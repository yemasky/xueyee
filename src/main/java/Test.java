import java.util.HashMap;
import java.util.Map;

import core.jdbc.mysql.whereCriteria;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<whereCriteria, HashMap<String, Object>> whereMap = new HashMap<whereCriteria, HashMap<String, Object>>();
		System.out.println(whereMap.isEmpty() + "--" + whereMap.size());

	}

}
