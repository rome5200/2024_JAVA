package Programming06;

import java.util.LinkedList;
import java.util.Queue;

public class IntArraytList {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for(int i = 10; i>= 0; i--) {
			q.add(i);
		}
		
		while (!q.isEmpty()) {
            System.out.print(q.remove()); 
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        }
        /*
		for(int i : q){
			System.out.print(q.poll());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}*/
	}
}
