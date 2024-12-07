package Programming06;

import java.util.Scanner;
import java.util.function.*;


public class StringLength {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(f.apply(s));
	}

}
