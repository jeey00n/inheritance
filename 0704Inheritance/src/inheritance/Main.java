package inheritance;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		//생성자를 호출하자 num과 name이 만들어지고 생성자 안의 연산이 실행된다.
		
		// 객체의 내용을 확인하고자 하면 System.out.println 메소드에
		// 객체의 이름만 대입
		System.out.println(emp1);

		Employee emp2 = new Employee();
		//또 생성자호출, num과 name이 만들어지고 생성자 안의 연산 실행
		//근데 static이 붙은 애는 유지된 상태고
		//나머지 애들만 계속 생성자 만들때 초기화돼서 새로 만들어지는 것.
		System.out.println(emp2);
		
		Manager man1 = new Manager();
		System.out.println(man1);
	}

}
