package co.eju.prj;

import java.util.HashMap;
import java.util.Map;

import co.eju.prj.vo.DevVO;

public class MainApp {
	
	private static MapTest mapTest; //����� ��ü ����
	public static void main(String[] args) {		
//		mapTest = new MapTest(); //�ʱ�ȭ
		
//		mapTest.setMap("ejuu","1234");
//		mapTest.setMap("ryu","5678");
//		mapTest.setMap("yeon","0913");
//		mapTest.setMap("jun","9900");
//		mapTest.setMap("bin","1205");
		
//		String pw = mapTest.getMap("ejuu"); //ryu�� �ش��ϴ� �н����带 ������
//		System.out.println(pw);
//		
//		Map<String, Integer > map = new HashMap<String, Integer>();
//		map.put("age", 23); 
//		map.put("id", 6);
		
//		int age = map.get("age");
//		System.out.println(age);
//		System.out.println(map.get("id")); //�������
		
		
		Map<String, DevVO> mapVo  = new HashMap<String, DevVO>();
		DevVO vo = new DevVO();
		vo.setId(1);
		vo.setName("ȫ�浿");
		vo.setAddress("����");
		vo.setAge(20);
		mapVo.put("ȫ�浿", vo);
		
		vo = new DevVO();
		vo.setId(2);
		vo.setName("�ڼ���");
		vo.setAddress("�뱸");
		vo.setAge(24);
		mapVo.put("�ڼ���", vo);
		
		
	
		//mapVo.get("ȫ�浿");
		DevVO vo1 = new DevVO();
		vo1 = mapVo.get("ȫ�浿");//ȫ�浿�̶�� Ű���带 ��������� �ش��ϴ� �����Ͱ� ���;���
		vo1.toString();
		
	}

	
}
