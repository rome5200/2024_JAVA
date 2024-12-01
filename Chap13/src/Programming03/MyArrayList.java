package Programming03;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		 System.out.print("[");
	        for (int i = 0; i < list.size()-1; i++)
	            System.out.print(list.get(i) + ", ");
	            System.out.println(list.get(list.size()-1) + "]");

	}

}
