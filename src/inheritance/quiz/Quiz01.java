package inheritance.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();

		tiger.leg = 4;
		eagle.leg = 2;
	}

}

class Animal {
	int leg;
}

class Tiger extends Animal {
	int tail;

}

class Eagle extends Animal {
	int wing;
}