package Programming02;

import java.util.*;
import java.util.stream.Collectors;

public class StringToLower {

	public static void main(String[] args) {
		List<String> string_list = Arrays.asList("Apple", "Banana", "Cherry");
		
		List<String> lower_list = string_list.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
		System.out.println(string_list);
		System.out.println(lower_list);
	}

}
