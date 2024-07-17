package polymorphism;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {

		// 회원 리스트 생성
		ArrayList<Customer> list = new ArrayList<Customer>();

		// 일반회원과 VIP회원 생성
		Customer customer1 = new Customer("둘리");
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도우너");
		Customer customer4 = new VIPCustomer("마이콜");
		Customer customer5 = new VIPCustomer("고길동");

		// 회원 리스트에 생성된 일반회원,VIP회원 추가
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);

		// 회원 리스트에 있는 회원들 전부를 한번씩 구매 및 할인,보너스 메소드 실행
		for (Customer customer : list) {
			customer.calcPrice(10000);
		}
		System.out.println();

		// 회원 리스트에 있는 회원들 전부를 한번씩 정보 출력
		for (Customer customer : list) {
			customer.showInfo();
		}
	}

}
