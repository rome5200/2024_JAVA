package Chap5_Programming;

class Car{
	private String model;
	private String make;
	private static int numberOfCars;
	
	Car(String model, String make){
		this.model = model;
		this.make = make;
		this.numberOfCars++;
	}
	public String getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public static void getNumberOfCars() {
		System.out.printf("자동차 1대 생산, 누적 생산량 %d대", numberOfCars);
		//System.out.println(numberOfCars);
	}
}
	
public class Chap5_Programming04 {
	public static void main(String[] args) {
		Car c1 = new Car("아반떼", "현대");
		Car c2 = new Car("그랜저", "현대");
		Car.getNumberOfCars();
	}
}
