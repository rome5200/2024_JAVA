package Practice;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i*4;
		System.out.println(f1.apply(3));
		
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Hello"));
	}

}
