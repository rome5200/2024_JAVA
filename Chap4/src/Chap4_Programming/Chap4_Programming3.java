package Chap4_Programming;

class Song {
	private String title;
	private String artist;
	private int length;
	
	public Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	
	public String toString() {
		return title+" "+artist+" "+length;
	}
	
}

public class Chap4_Programming3 {

	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound", "Nana", 180);
		//Song s2 = new Song("Jambalya", "Carpenters");
		//Song s3 = new Song("Yesterday");
		//Song s4 = new Song();
		System.out.println(s1);
	}

}
