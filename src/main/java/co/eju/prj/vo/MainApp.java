package co.eju.prj.vo;

import java.util.HashMap;
import java.util.Map;

//import java.util.ArrayList;
//import java.util.List;

public class MainApp {
	
	private static Map<String, Command> map = new HashMap<String,Command>();
			//���Ÿ���� ����
	
	public static void main(String[] args) {
		map.put("car",new Car());
		map.put("bycle", new Bycle());
		
		Command command = map.get("bycle");
		command.run();
		
//	private static DevVO vo; // VO��ü �ν��Ͻ� ����
//		List<DevVO> list = new ArrayList<DevVO>();
//		vo = new DevVO(); //��ü�� �ʱ�ȭ �� ��
//		vo.setId(1);
//		vo.setName("ȫ�浿");
//		vo.setAddress("�뱸������ �߱�");
//		vo.setAge(23);
	
//		list.add(vo); //array ����Ʈ ������ ��ü �ϳ��� �߰��� ��
		
//		vo = new DevVO(); //��ü�� �ʱ�ȭ �� ��
//		vo.setId(2);
//		vo.setName("ȫ���");
//		vo.setAddress("�뱸������ ����");
//		vo.setAge(23);
		
//		list.add(vo);
		
		//��� 1
//		System.out.println(list.get(0).getId());//list 0 �� °�� id�� ��������� ��
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getAddress());
//		System.out.println(list.get(0).getAge());
//		
//		System.out.println("===================================");
		
//		list.get(0).toString();
//		list.get(1).toString(); // ��� 2.�̷��� �ϸ� �� �� ó�� �ϳ��ϳ� ��������ʰ�
		//list�� ������ �ִ� ù��° ��Ҹ� ����� �� �ְ� ��.
		
//		System.out.println("===================================");

//		for(int i = 0; i < list.size(); i++){ //��� 3. ����Ʈ ��� ���� ��� ��ü
//			//�迭���� ���ϴ� ���� size�� ��� ��
//			list.get(i).toString();
//		}
//		System.out.println("===================================");

		//��� 4 . list��ü�� �������� ��
//		for(DevVO vo : list) {
//			vo.toString();
//		}
	}

}
