package Programming07;

import java.util.function.BiFunction;

public class BiFunctionsTest {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (x1, x2) -> x1 + x2;
		Integer sum = f.apply(10, 3);
		System.out.println(sum);
	}

}
