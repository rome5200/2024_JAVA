package Programming01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Method {

	public static void main(String[] args) {
		List<Integer> int_list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Double> sqrt_list = int_list.stream()
                                         .map(Math::sqrt) 
                                         .collect(Collectors.toList());
        
        System.out.println(int_list);
        System.out.println(sqrt_list);

	}

}
