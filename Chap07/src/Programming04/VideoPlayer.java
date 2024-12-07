package Programming04;

interface Controllable{
	void play();
	void stop();
}

public class VideoPlayer implements Controllable {
	@Override
	public void play() { System.out.println("재생"); }
	public void stop() { System.out.println("멈춤"); }
	
	public static void main(String[] args) {
		VideoPlayer v1 = new VideoPlayer();
		v1.play();
		v1.stop();
	}
}
