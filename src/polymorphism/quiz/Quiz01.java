package polymorphism.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		runCar(new Car()); // Car car = new Car();
		runCar(new Bus()); // Car car = new Bus();
		runCar(new SportsCar()); // Car car new SportsCar();
		runCar(new FireCar()); // FireCar fireCar = new FireCar();
	}
	
	// 공통 메소드(참조타입:부모클래스)
	public static void runCar(Car car) {
		car.runCar();
	}
	
	// 단일 메소드(참조타입:단일클래스)
	public static void runCar(FireCar fireCar) {
		fireCar.runCar();
	}
}

// 자동차 클래스
class Car {

	public void runCar() {
		System.out.println("자동차가 달린다");
	}
}

// 버스 클래스
class Bus extends Car {

	@Override
	public void runCar() {
		System.out.println("버스가 달린다");
	}

}

// 스포츠카 클래스
class SportsCar extends Car {

	@Override
	public void runCar() {
		System.out.println("스포츠카가 달린다");
	}

}

// 소방차 클래스
class FireCar {
	
	public void runCar() {
		System.out.println("소방차가 달린다");
	}
}