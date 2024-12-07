package Exercise;

import java.util.Arrays;
import java.util.List;

public class Excercise04 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		
		System.out.println(numbers.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n * 2)
				.reduce(0, Integer::sum));
		

	}

}
