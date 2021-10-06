package co.eju.prj;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	private Map<String, String> map = new HashMap<String, String>();
				//key	value						key		value
	public void setMap(String id, String password) { //맵 구조에 데이터를 삽입한 것
		map.put(id, password); //★★중요
		
	}
	public String getMap(String id) {  //맴에서 key에 맞는 데이터를 가져온다
		return map.get(id);
		
	}
}
