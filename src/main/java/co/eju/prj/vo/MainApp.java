package co.eju.prj.vo;

import java.util.HashMap;
import java.util.Map;

//import java.util.ArrayList;
//import java.util.List;

public class MainApp {
	
	private static Map<String, Command> map = new HashMap<String,Command>();
			//멤버타입을 형성
	
	public static void main(String[] args) {
		map.put("car",new Car());
		map.put("bycle", new Bycle());
		
		Command command = map.get("bycle");
		command.run();
		
//	private static DevVO vo; // VO객체 인스턴스 정의
//		List<DevVO> list = new ArrayList<DevVO>();
//		vo = new DevVO(); //객체를 초기화 한 것
//		vo.setId(1);
//		vo.setName("홍길동");
//		vo.setAddress("대구광역시 중구");
//		vo.setAge(23);
	
//		list.add(vo); //array 리스트 구조에 객체 하나를 추가한 것
		
//		vo = new DevVO(); //객체를 초기화 한 것
//		vo.setId(2);
//		vo.setName("홍길순");
//		vo.setAddress("대구광역시 서구");
//		vo.setAge(23);
		
//		list.add(vo);
		
		//방법 1
//		System.out.println(list.get(0).getId());//list 0 번 째에 id를 가져오라는 뜻
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getAddress());
//		System.out.println(list.get(0).getAge());
//		
//		System.out.println("===================================");
		
//		list.get(0).toString();
//		list.get(1).toString(); // 방법 2.이렇게 하면 윗 줄 처럼 하나하나 출력하지않고
		//list가 가지고 있는 첫번째 요소를 출력할 수 있게 됨.
		
//		System.out.println("===================================");

//		for(int i = 0; i < list.size(); i++){ //방법 3. 리스트 요소 값을 출력 전체
//			//배열길이 구하는 것은 size를 사용 함
//			list.get(i).toString();
//		}
//		System.out.println("===================================");

		//방법 4 . list전체를 가져오는 것
//		for(DevVO vo : list) {
//			vo.toString();
//		}
	}

}
