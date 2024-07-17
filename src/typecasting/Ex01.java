package typecasting;

public class Ex01 {

	public static void main(String[] args) {
		
		VIPCustomer vipCustomer = new VIPCustomer();
		
	}

}

//일반 회원
class Customer {
	String customerName; // 회워 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률(1%)

	public Customer() {
		super();
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}

	// 결제 및 포인트 적립 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	// 회원 조회 메소드
	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.");
	}
}

//VIP 회원
class VIPCustomer extends Customer {
	double saleRatio;

	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05; // 적립률(5%)
		saleRatio = 0.1; // 할인률(10%)
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
}