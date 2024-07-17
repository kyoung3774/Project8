package override.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.eat();
		cat.sound();
		System.out.println();
		
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		System.out.println();
	}

}

// 동물 클래스
class Animal {
	
	// 먹는다 메소드
	public void eat() {
		
	}
	
	// 짖는다 메소드
	public void sound() {
		
	}
}

// 고양이 클래스
class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 운다");
	}
	
}

// 개 클래스
class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("개는 짬을 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("개는 멍멍하고 짖는다");
	}

	
}