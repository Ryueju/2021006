package co.eju.prj.vo;

public class DevVO {
	private int id; //컬럼,변수 명을 일치시켜야함
	private String name;
	private String address;
	private int age;
	
	public DevVO() { //생성자 하나 만들어주는 이유: 내가 생성자 오버로딩을 할 수 있기 때문이쥐
		//변수와 GET,SET으로만 생성되어있는 것 VO객체, DTO객체라고 함
		
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
	
	//출력구문 toString 메소드를 오버라이드 해서 사용하는 것임
	public String toString() {
		System.out.print("아이디 : " + id + " ");
		System.out.print("이름 : " + name+ " ");
		System.out.print("주소 : " + address+ " ");
		System.out.print("나이 : " + age+ "\n");
		return null;
	}
	
}
