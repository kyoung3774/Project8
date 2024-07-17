package polymorphism;

public class Ex03 {

	public static void main(String[] args) {
		
		moveAnimal(new Animal()); // Animal animal = new Animal();
		moveAnimal(new Human()); // Animal animal = new Human();
		moveAnimal(new Tiger()); // Animal animal = new Tiger();
		moveAnimal(new Eagle()); // Animal animal = new Eagle();
		System.out.println();
		moveAnimal(new Human()); // Human human = new human();
	}

	public static void moveAnimal(Animal animal) {
		animal.move(); // 재정의된 메소드가 호출됨
	}
	
	public static void moveAnimal(Human human) {
		human.move();
	}
}

