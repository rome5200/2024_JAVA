package Practice;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");
		list.add(2, "GREPE");
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
