package inheritance.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		BasicTV basicTV = new BasicTV(true, 7, 20);
		SmartTV smartTV = new SmartTV(true, 11, 30, "192.168.0.111");

		basicTV.showInfo();
		smartTV.showInfo();
	}

}

class BasicTV {
	boolean isPower;
	int channel;
	int volume;

	public BasicTV(boolean isPower, int channel, int volume) {
		super();
		this.isPower = isPower;
		this.channel = channel;
		this.volume = volume;
	}

	public void showInfo() {
		System.out.println(isPower + " / " + channel + " / " + volume);
	}
}

class SmartTV extends BasicTV {
	String ip;

	public SmartTV(boolean isPower, int channel, int volume, String iP) {
		super(isPower, channel, volume);
		this.ip = iP;
	}

	public void showInfo() {
		System.out.println(isPower + " / " + channel + " / " + volume + " / " + ip);
	}
}