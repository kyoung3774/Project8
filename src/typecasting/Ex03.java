package typecasting;

public class Ex03 {

	public static void main(String[] args) {

		// 부모타입 변수 = 자식 인스턴스 생성(형변환)
		Customer2 vc = new VIPCustomer2("둘리");
		
		// 자식타입 변수 = 부모 인스턴스 생성(강제형변환)
		VIPCustomer2 vc2 = (VIPCustomer2)new Customer2("또치");
		
		// vs변수는 Customer2 클래스의 멤버변수와 메소드만 사용 할 수 있음
		
		
	}

}
