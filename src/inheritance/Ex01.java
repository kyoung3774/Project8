package inheritance;

public class Ex01 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.nationality = "한국";
		child.lastName = "고";
		child.firstName = "길동";
	}

}

//부모 클래스
class Perents {
	String nationality;
	String lastName;
}

//자식 클래스
class Child extends Perents {
	String firstName;
}