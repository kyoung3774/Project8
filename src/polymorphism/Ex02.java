package polymorphism;

public class Ex02 {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("둘리");
		customer1.calcPrice(10000);
		customer1.showInfo();
		System.out.println();
		
		Customer customer2 = new VIPCustomer("또치");
		customer2.calcPrice(10000);
		customer2.showInfo();
		
		// 다형성을 활용하면 부모클래스 하나로 여러개의 자식 클래스를 사용할 수 있음
	}

}

//일반 회원 클래스
class Customer {
	String customerName; // 회워 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 적립 포인트
	double bonusRatio; // 적립률(1%)

	// 일반 회원 생성자
	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;

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

//VIP 회원 클래스
class VIPCustomer extends Customer {
	double saleRatio;

	// VIP 회원 생성자
	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05; // 적립률(5%)
		saleRatio = 0.1; // 할인률(10%)

	}

	// 재정의
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}

}