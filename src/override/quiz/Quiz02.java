package override.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		Coffee coffee1 = new Coffee();
		coffee1.drinking();
		
		Coffee coffee2 = new Americano();
		coffee2.drinking();
		
		Coffee coffee3 = new Latte();
		coffee3.drinking();
	}

}

// 커피 클래스
class Coffee {
	
	// 마신다 메소드
	public void drinking() {
		System.out.println("커피를 마신다");
	}
}

// 아메리카노 클래스
class Americano extends Coffee {

	@Override
	public void drinking() {
		System.out.println("아메리카노를 마신다");
	}
	
}

// 라떼 클래스
class Latte extends Coffee {

	@Override
	public void drinking() {
		System.out.println("라떼를 마신다");
	}
	
}