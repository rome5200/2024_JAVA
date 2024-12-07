package Programming05;

interface Animal {
	void bark();
}

public class MyClass {

	public static void main(String[] args) {
		Animal dog = new Animal() {
			public void bark() {
				System.out.println("bark");
			}
		};
		dog.bark();
	}

}
