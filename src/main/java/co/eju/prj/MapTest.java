package co.eju.prj;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	private Map<String, String> map = new HashMap<String, String>();
				//key	value						key		value
	public void setMap(String id, String password) { //�� ������ �����͸� ������ ��
		map.put(id, password); //�ڡ��߿�
		
	}
	public String getMap(String id) {  //�ɿ��� key�� �´� �����͸� �����´�
		return map.get(id);
		
	}
}
