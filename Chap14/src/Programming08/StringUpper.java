package Programming08;

import java.util.*;
import java.util.stream.*;

public class StringUpper {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kim", "Park", "He", "I", "Lee", "Hello", "World");
		List<String> result = 
				list.stream().filter(n -> n.length() >= 3)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
