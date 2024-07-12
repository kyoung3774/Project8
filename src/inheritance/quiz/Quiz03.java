package inheritance.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
		VolPen volPen = new VolPen(2,100,"파랑색");
		FountainPen fountainPen = new FountainPen(3, 80, "몽블랑");
	}

}

// 펜 클래스
class Pen {

	int thick;
	int amountLeft;
	
	public Pen(int thick, int amountLeft) {
		this.thick = thick;
		this.amountLeft = amountLeft;
	}
	
}

// 볼펜 클래스
class VolPen extends Pen {
	String color;

	public VolPen(int thick, int amountLeft, String color) {
		super(thick, amountLeft);
		this.color = color;
	}

	
}

// 만년필 클래스
class FountainPen extends Pen{
	String brand;

	public FountainPen(int thick, int amountLeft, String brand) {
		super(thick, amountLeft);
		this.brand = brand;
	}

}