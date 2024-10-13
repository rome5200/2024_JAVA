package Chap5_Programming;

import java.util.ArrayList;
import java.util.Scanner;

class Word{
	String kor;
	String eng;

	public Word(String kor, String eng) {
		this.kor = kor;
		this.eng = eng;
	}	
}

public class Chap5_Programming07 {

	public static void main(String[] args) {
		ArrayList<Word> list = new ArrayList<Word>();
		list.add(new Word("집", "house"));
		list.add(new Word("개", "dog"));
		list.add(new Word("고양이", "cat"));
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("input (종료 : quit) : ");
			String input = sc.next();
			 if (input.equals("quit")) { 
				 System.out.println("exit.");
	             break;
	         }
			 boolean found = false;
			 
			 for (Word w : list) {
	                if (w.eng.equals(input)) {
	                    System.out.println(w.eng+" -> "+w.kor);
	                    found = true;
	                    break;
	                }
	         }
			 if (!found) 
				 System.out.println("not found");
            }
        }
	}
}
