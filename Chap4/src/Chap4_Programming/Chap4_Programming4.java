package Chap4_Programming;

class Dog{
	private String name;
	private String breed;
	private int age;
	
	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = "Unknown";
	}
	
	@Override
    public String toString() {
        return "(" + name + ", " + age + ", " + breed + ")"; 
    }
	
	public void barking(boolean onFlag) {
		if (onFlag)
			System.out.println("Bowwow");
		else
			System.out.println("...");
	}
	
}

public class Chap4_Programming4 {

	public static void main(String[] args) {
		Dog dog = new Dog("orange", 1, "york");
		System.out.println(dog);
		dog.barking(false);
	}

}
