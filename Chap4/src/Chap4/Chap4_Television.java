package Chap4;

public class Chap4_Television {

	int channel;
	int volume;
	boolean onOff;
	
	public static void main(String[] args) {
		Chap4_Television myTv = new Chap4_Television();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		Chap4_Television yourTv = new Chap4_Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.printf("나의 텔레비전의 채널은 %d번 이고 볼륨은 %d입니다.\n", myTv.channel, myTv.volume);
		System.out.printf("너의 텔레비전의 채널은 %d번 이고 볼륨은 %d입니다.", yourTv.channel, yourTv.volume);
	}

}
