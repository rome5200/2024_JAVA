package Programming04;

import java.util.HashSet;

public class MyClass {
	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");

        HashSet<String> s2 = new HashSet<>();
        s2.add("A");
        s2.add("D");

        HashSet<String> union = new HashSet<>(s1);
        union.addAll(s2);

        HashSet<String> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        // 결과 출력
        System.out.println("합집합 " + union);
        System.out.println("교집합 " + intersection);
	}
}
