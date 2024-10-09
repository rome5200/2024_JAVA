package Chap3_Programming;

public class Chap3_Programming13 {

	public static void main(String[] args) {
        String[] markers = {"Spades", "Diamonds", "Hearts", "Clubs"};
        
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        for (int i = 0; i < 5; i++) {
            int markerIndex = (int)(Math.random()*markers.length);
            int numberIndex = (int)(Math.random()*numbers.length);
            
            String marker = markers[markerIndex];
            String number = numbers[numberIndex];
            System.out.println(marker+"의 "+number);
        }

	}

}
