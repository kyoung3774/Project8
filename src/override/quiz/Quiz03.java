package override.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		System.out.println();
		
		Computer computer2 = new NoteBook();
		computer2.on();
		computer2.off();
		System.out.println();
		
		Computer computer3 = new DeskTop();
		computer3.on();
		computer3.off();
		System.out.println();
	}

}

// 컴퓨터 클래스
class Computer {
	
	// on 메소드
	public void on() {
		System.out.println("컴퓨터 on");
	}
	
	// off 메소드
	public void off() {
		System.out.println("컴퓨터 off");
	}
}

// 노트북 클래스
class NoteBook extends Computer {

	@Override
	public void on() {
		System.out.println("노트북 on");
	}

	@Override
	public void off() {
		System.out.println("노트북 off");
	}
	
	
}

// 데스크탑 클래스
class DeskTop extends Computer {

	@Override
	public void on() {
		System.out.println("데스크탑 on");
	}

	@Override
	public void off() {
		System.out.println("데스크탑 off");
	}
	
}