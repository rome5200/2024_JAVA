package Practice;

import java.util.function.*;

public class InterfaceTest {

	public static void main(String[] args) {
		// Predicate : true 또는 false 반환
		Predicate<String> predicate = (v) -> v != null;
		System.out.println(predicate.test("hi"));
		System.out.println(predicate.test(null));
		
		// Supplier : 일종의 값을 제공하는 함수
		Supplier<Integer> supplier = () -> (int)(Math.random() *100);
		System.out.println(supplier.get());
		
		// Consumer : 값을 반환하지 않고 값을 소비하는 함수
		Consumer<Integer> consumer = (value) -> System.out.println(value);
		consumer.accept(10);
        consumer.accept(25);
        
        //BiFunction
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(1, 2);
        System.out.println(result);
        BiFunction<Integer, Integer, Double> func1 = (x1, x2) -> Math.pow(x1,x2);
        Double result2 = func1.apply(10, 2);
        System.out.println(result2);
	}

}
