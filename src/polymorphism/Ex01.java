package polymorphism;

public class Ex01 {

	public static void main(String[] args) {
		
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		Human human2 = new Human();
		
		human.move();
		tiger.move();
		eagle.move();
		
		human2.move2();

		
		
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
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void move2() {
		System.out.println("다형성 X");
	}
	
}

// 호랑이 클래스
class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	
}

// 독수리 클래스
class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}

	
}