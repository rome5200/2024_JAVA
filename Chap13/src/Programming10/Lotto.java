package Programming10;

import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		int count = 0;
		while (count < 6) {
			int n = (int) (Math.random()*45)+1;
			if(!s.contains(n)) {
				s.add(n);
				count++;
			}
		}
		System.out.print("Lotto [set="+s+"]");
	}

}
