package programming10;

public class programming10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {1.0, 2.0, 3.0, 4.0};
		double sum = 0;
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			sum += a[i];
			if (a[i]>max)
				max = a[i];
		}
		System.out.println();
		System.out.println("sum = " + sum);
		System.out.println("max = " + max);
	}

}
