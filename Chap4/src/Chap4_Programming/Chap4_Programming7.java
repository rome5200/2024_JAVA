package Chap4_Programming;

class Movie{
	private String name;
	private double rating;
	private String director;
	private int year;
	private String mainActor;
	
	public Movie(String n, String d, int y, String m, double r) {
		name = n;
		director = d;
		year = y;
		mainActor = m;
		rating = r;
	}
	
	public String toString() {
		return "영화제목 : "+name+"\n감독 : "+director+"\n연도 : "
				+year+"\n주연배우 : "+mainActor+"\n평점 : "+rating;	
	}
}

public class Chap4_Programming7 {

	public static void main(String[] args) {
		Movie movie = new Movie("티파니에서 아침을", "블레이크 에드워즈", 1962, "오드리 햅번", 8.43);
		System.out.println(movie);
	}

}
