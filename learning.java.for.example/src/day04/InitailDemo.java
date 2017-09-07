package day04;

public class InitailDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student student=new Student();
//		System.out.println(student.name);
		CollegeStudent collegeStudents = new CollegeStudent();
		collegeStudents.show();
		//创建时，优先创建父类对象，再创建子类对象
		//仅仅只创建子类对象，自动先执行父类的构造方法，再执行子类的构造方法
//		collegeStudents.age=23;
//		collegeStudents.grade();
	}

}
