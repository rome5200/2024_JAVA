package Programming08;

import java.util.Scanner;

interface GetInfo {
	double getValue();
}

public class Student implements GetInfo {
	static Scanner sc = new Scanner(System.in);
		
		public double grade;
		
		public Student(double grade) {
			this.grade = grade;
		}
		
		public static Student getStudent() {
			System.out.print("성적을 입력하세요 : ");
			double g = sc.nextDouble();
			return new Student(g);
		}
		
		public double getValue() {
			return this.grade;
		}
		
		public static double getAverage(GetInfo[] objects) {
			if(objects.length == 0) return 0;
			
			double sum = 0.0;
			
			for(GetInfo s : objects) {
				sum += s.getValue();
			}
			return sum / objects.length;
		}
	public static void main(String[] args) {
		Student[] studentArray = new Student[4];
		for(int i = 0; i < 4; i++)
			studentArray[i] = Student.getStudent();
		System.out.println(Student.getAverage(studentArray));
	}
}
