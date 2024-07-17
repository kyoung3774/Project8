package downcasting;

public class Ex01 {

	public static void main(String[] args) {
		
		// 부모타입 변수 인스턴스 자식
		Animal animal = new Human();
		
		// 다운 캐스팅(강제 형변환(참조형)) / 키워드: instanceof
		if(animal instanceof Human) { // 부모타입 변수 instanceof 자식클래스
			Human human = (Human)animal; // 자식클래스 변수 = (자식클래스)부모타입 변수
			human.readBook();
			System.out.println();
		}
		
		move(new Animal());
		move(new Human());
		move(new Tiger());
		move(new Eagle());
	}
	
	public static void move(Animal animal) {
		animal.move();
	}
}

// 동물 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

// 사람 클래스
class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

// 호랑이 클래스
class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

// 독수리 클래스
class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 뜁니다.");
	}

	public void flying() {
		System.out.println("독수리가 납니다");
	}
}