package Practice;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Supplier;

interface MyInterface {
	public Student get(String str); 
}

class Student{
	private String name;
	public Student(String name) {
	this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

class Calculator {
	public static int add(int a, int b) {
		return a+b;
	}
}

public class Test {
	static void print(Supplier<Integer> f) {
		System.out.println(f.get());
	}
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> obj = Calculator::add;
		int result = obj.apply(10, 20);
		System.out.println("주어진 수의 덧셈 : " + result);
		
		String s = "Hello World!";
		print(s::length);
		
		String[] sArray = {"Kim", "Park", "Lee", " Choi", "Mary"};
		System.out.println(Arrays.toString(sArray));
		Arrays.sort(sArray, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(sArray));
		
		MyInterface object = Student::new;
		Student student = object.get("Park");
		System.out.println(student);
	}

}
