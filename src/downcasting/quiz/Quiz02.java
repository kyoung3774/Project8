package downcasting.quiz;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<People> list = new ArrayList<People>();

		list.add(new Student("둘리"));
		list.add(new Worker("또치"));

		for(People people : list) {
			people.eat();
		}
		System.out.println();
		
		for (People people : list) {
			if (people instanceof Student) {
				Student student = (Student) people;
				student.study();
			}
			if (people instanceof Worker) {
				Worker worker = (Worker) people;
				worker.work();
			}
		}

	}

}

// 사람 클래스
class People {
	String name;

	// 사람 생성자
	public People(String name) {
		super();
		this.name = name;
	}

	// 사람 메소드
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
}

// 학생 클래스
class Student extends People {

	// 학생 생성자
	public Student(String name) {
		super(name);
	}

	// 학생 공부 메소드
	public void study() {
		System.out.println(name + " 학생이 공부를 한다.");
	}

	// 학생 메소드 재정의
	@Override
	public void eat() {
		System.out.println(name + "가 밥을 먹는다.");
	}
}

// 회사원 클래스
class Worker extends People {

	// 회사원 생성자
	public Worker(String name) {
		super(name);
	}

	// 회사원 근무 메소드
	public void work() {
		System.out.println(name + " 회사원이 일을 한다.");
	}

	// 회사원 메소드 재정의
	@Override
	public void eat() {
		System.out.println(name + "가 밥을 먹는다.");
	}
}