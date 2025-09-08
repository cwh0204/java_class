package day16;

public class Student extends Person {
	
	int studentNo;
	public Student(String name,int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("자바 공부를 한다.");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}
	
}
