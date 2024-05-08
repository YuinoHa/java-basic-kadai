package kadai_014;

public class Car_chapter14 {
	private int gear = 0;
	private int speed = 0;
	
	public Car_chapter14(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange(final int afterGear) {
		
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		switch(afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
