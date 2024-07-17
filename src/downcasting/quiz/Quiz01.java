package downcasting.quiz;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();

		Animal human = new Human();
		list.add(human);
		list.add(new Tiger());
		list.add(new Eagle());

		for (Animal animal : list) {
			if (animal instanceof Human) {
				Human human1 = (Human) animal;
				human1.readBook();
				continue;
			}

			if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
				continue;
			}

			if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
				continue;
			}
		}
		System.out.println();
		System.out.println(list.size());
		for (int i = 0; i <= list.size()-1; i++) {
			
		}
	}

}

//동물 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//사람 클래스
class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

//호랑이 클래스
class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

//독수리 클래스
class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 뜁니다.");
	}

	public void flying() {
		System.out.println("독수리가 납니다");
	}
}