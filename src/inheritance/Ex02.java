package inheritance;

public class Ex02 {

	public static void main(String[] args) {

		Student student = new Student();
		student.eat(); // 보무 메소드
		student.sound(); // 부모 메소드
		student.study(); // 자신 메소드
		
		Professor professor = new Professor();
		professor.eat();
		professor.sound();
		professor.work();
	}

}

// 사람 클래스
class Person {

	public void eat() {
		System.out.println("밥을 먹는다");
	}

	public void sound() {
		System.out.println("대화를 한다");
	}

}

// 학생 클래스
class Student extends Person {

	public void study() {
		System.out.println("공부를 한다");
	}
}

// 교수 클래스
class Professor extends Person {

	public void work() {
		System.out.println("일을 한다");
	}
}