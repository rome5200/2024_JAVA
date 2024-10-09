package Chap2;

public class Chap2_BitOperator {

	public static void main(String[] args) {
		byte status = 0b01101110;
		
		System.out.print("문열림상태 = "+((status&0b00000100)!=0));
	}

}
