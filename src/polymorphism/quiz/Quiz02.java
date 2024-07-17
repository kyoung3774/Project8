package polymorphism.quiz;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		// 회원 리스트 생성
		ArrayList<Customer> list = new ArrayList<Customer>();

		// 일반회원과 VIP회원 생성
		Customer customer1 = new Customer("둘리");
		Customer customer2 = new VIPCustomer("또치");
		Customer customer3 = new GOLDCustomer("도우너");
		// 회원 리스트에 생성된 일반회원,VIP회원 추가
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);

		list.add(new Customer("범부"));
		list.add(new GOLDCustomer("골드"));
		list.add(new VIPCustomer("브이아이피"));

		for (Customer customer : list) {
			customer.calcPrice(10000); // 회원 리스트에 있는 회원들 전부를 한번씩 구매 및 할인,보너스 메소드 실행
			customer.showInfo(); // 회원 리스트에 있는 회원들 전부를 한번씩 정보 출력
			System.out.println();
		}
	}
}

// 일반 회원 클래스
class Customer {
	String name;
	String grade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String name) {
		super();
		this.name = name;
		grade = "SILVER";
		bonusRatio = 0.01;
	}

	// 결제 및 포인트 적립 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(name + "님이 " + price + "원을 결제했습니다.");
	}

	// 회원 조회 메소드
	public void showInfo() {
		System.out.println(name + "님의 등급은 " + grade + "이며, 적립 포인트는" + bonusPoint + "입니다.");
	}

}

// VIP 회원 클래스
class VIPCustomer extends Customer {
	double saleRatio;

	public VIPCustomer(String name) {
		super(name);
		grade = "VIP";
		bonusRatio = 0.05; // 적립률(5%)
		saleRatio = 0.1; // 할인률(10%)
	}
	
	// 재정의 
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(name + "님이 " + salePrice + "원을 결제했습니다.");
	}

}

// GOLD 회원 클래스
class GOLDCustomer extends VIPCustomer {

	public GOLDCustomer(String name) {
		super(name);
		grade = "GOLD";
		bonusRatio = 0.02; // 적립률(2%)
		saleRatio = 0.1; // 할인률(10%)
	}

}