package co.eju.prj.vo;

public class DevVO {
	private int id; //�÷�,���� ���� ��ġ���Ѿ���
	private String name;
	private String address;
	private int age;
	
	public DevVO() { //������ �ϳ� ������ִ� ����: ���� ������ �����ε��� �� �� �ֱ� ��������
		//������ GET,SET���θ� �����Ǿ��ִ� �� VO��ü, DTO��ü��� ��
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//��±��� toString �޼ҵ带 �������̵� �ؼ� ����ϴ� ����
	public String toString() {
		System.out.print("���̵� : " + id + " ");
		System.out.print("�̸� : " + name+ " ");
		System.out.print("�ּ� : " + address+ " ");
		System.out.print("���� : " + age+ "\n");
		return null;
	}
	
}
