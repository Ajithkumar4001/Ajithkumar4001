package week1.day1;

public class Car {
	public void start() {
		System.out.println("Car Engine Start");
	}public void accelerate() {
		System.out.println("Car Moves  on");
	}public void stop() {
		System.out.println("Car Engine off");
	}public static void main(String[] args) {
				Car action=new Car();
				action.start();
				action.accelerate();
				action.stop();

	}
}
