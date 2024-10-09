package Chap4_Programming;

class Student{
	private String name;
	private int studentId;
	private int age;
	
	public Student(String n, int i, int a) {
		name = n;
		studentId = i;
		age = a;
	}
	
	public String toString() {
		return "학생의 이름 : "+name+"\n학생의 학번 : "+studentId+
				"\n학생의 나이 : "+age+"\nstudent 객체가 생성되었습니다.";
	}
}

public class Chap4_Programming5 {

	public static void main(String[] args) {
		Student student = new Student("kim", 0001, 20);
		System.out.println(student);

	}

}
