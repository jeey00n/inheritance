package inheritance;

//Employee클래스를 상속받은 Manager 클래스
public class Manager extends Employee {
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는
	//안드로이드에서 많이 발생합니다.
	public Manager() {
		super (10);
	}
		private String task;
		//직책을 저장할 변수

		public String getTask() {
			return task;
		}
		//메소드 원형: setTask(String)   이름+자료형+개수
		//왼쪽 화면을 펼치면 나오는 모양들이 메소드 원형이다.
		public void setTask(String task) {
			this.task = task;
		}

		@Override
		public String toString() {
			//super.toString()은 상위 클래스인 Employee의 toString을 호출합니다.
			return super.toString()+"Manager [task=" + task + "]";
			//따라서 윗줄의 toString은 Employee의 것이 옵니다.
		}
		
}



