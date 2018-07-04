package inheritance;

//직원 정보를 저장하기 위한 클래스
public class Employee {
	// 번호와 이름을 저장하기 위한 변수
	protected int num;
	protected String name;
	//원래 멤버변수는 private으로 만드는데 이 경우 상속받고 나서 쓸 수가 없다.
	//멤버변수를 public으로 만들지 말고 protected로 만들어 주면
	//상속받은 다음에도 변수를 사용할 수 있다.

	// num의 값을 일련번호로 만들기 위한 공유변수 - static
	private static int autoincrement; // 현재까진 0으로 존재하는 것.

	// 생성자(Constructor)
	public Employee(int n) {
		// 일련번호 만들기
		autoincrement = autoincrement + 1;
		num = autoincrement;
	}


	// 인스턴스 변수를 사용할 수 있도록 하기 위한 접근자 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 값을 확인하기 쉽게 하기 위한 메소드
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}

}
