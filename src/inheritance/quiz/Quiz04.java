package inheritance.quiz;

public class Quiz04 {

	public static void main(String[] args) {

		Monster monster = new Monster(10, 100);
		monster.showInfo();
		monster.doAttack();
		System.out.println();

		Slime slime = new Slime(30, 200, "마비");
		slime.showInfo();
		slime.doAttack();
		slime.doSkill();

	}

}

// 몬스터 클래스
class Monster {
	String name;
	int attack;
	int lifePoint;
	
	// 몬스터 생성자
	public Monster(int attack, int lifePoint) {
		super();
		name = "몬스터";
		this.attack = attack;
		this.lifePoint = lifePoint;
	}
	
	// 어택 메소드
	public void doAttack() {
		System.out.println(name + "가(이) " + attack + "만큼 공격했다.");
	}
	
	// 상태 메소드
	public void showInfo() {
		System.out.println(name + "의 공격력은 " + attack + "체력은 " + lifePoint + "이다");
	}
}

// 슬라임 클래스
class Slime extends Monster {
	String skill;
	
	// 슬라임 생성자
	public Slime(int attack, int lifePoint, String skill) {
		super(attack, lifePoint);
		name = "슬라임";
		this.skill = skill;
	}
	
	// 스킬 메소드
	public void doSkill() {
		System.out.println(name + "이 " + skill + "을 시전했다.");
	}

}