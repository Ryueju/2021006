package co.eju.prj;

import java.util.HashMap;
import java.util.Map;

import co.eju.prj.vo.DevVO;

public class MainApp {
	
	private static MapTest mapTest; //사용할 객체 생성
	public static void main(String[] args) {		
//		mapTest = new MapTest(); //초기화
		
//		mapTest.setMap("ejuu","1234");
//		mapTest.setMap("ryu","5678");
//		mapTest.setMap("yeon","0913");
//		mapTest.setMap("jun","9900");
//		mapTest.setMap("bin","1205");
		
//		String pw = mapTest.getMap("ejuu"); //ryu에 해당하는 패스워드를 돌려줌
//		System.out.println(pw);
//		
//		Map<String, Integer > map = new HashMap<String, Integer>();
//		map.put("age", 23); 
//		map.put("id", 6);
		
//		int age = map.get("age");
//		System.out.println(age);
//		System.out.println(map.get("id")); //직접출력
		
		
		Map<String, DevVO> mapVo  = new HashMap<String, DevVO>();
		DevVO vo = new DevVO();
		vo.setId(1);
		vo.setName("홍길동");
		vo.setAddress("서울");
		vo.setAge(20);
		mapVo.put("홍길동", vo);
		
		vo = new DevVO();
		vo.setId(2);
		vo.setName("박수동");
		vo.setAddress("대구");
		vo.setAge(24);
		mapVo.put("박수동", vo);
		
		
	
		//mapVo.get("홍길동");
		DevVO vo1 = new DevVO();
		vo1 = mapVo.get("홍길동");//홍길동이라는 키워드를 집어ㄴ넣으면 해당하는 데이터가 나와야함
		vo1.toString();
		
	}

	
}
