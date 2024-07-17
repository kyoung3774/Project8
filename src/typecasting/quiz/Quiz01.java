package typecasting.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Parents parents = new Child("한국", "고", "길동");
		parents.showInfo();
		
		Child child = new Child("한국", "고", "둘리");
		child.showInfo();
	}

}

// 부모 클래스
class Parents {
	String nationality; // 국적
	String lastName; // 성

	// 부모 생성자
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}

	// 부모 메소드
	public void showInfo() {
		System.out.println("국적: " + nationality);
		System.out.println("성: " + lastName);
		System.out.println();
	}
}

// 자식 클래스
class Child extends Parents {
	String firstName; // 이름

	// 자식 생성자
	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}

	// 자식 메소드
	public void showInfo() {
		System.out.println("국적: " + nationality);
		System.out.println("성: " + lastName);
		System.out.println("이름: " + firstName);
		System.out.println();
	}
}