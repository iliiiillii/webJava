package sec02.ex03;

public class Middle extends Student {
	
	public Middle(String name, int grade) {
		super();
		System.out.println("Middle 클래스 생성자 호출");
		super.name = name;
		super.grade = grade;
	}

}
