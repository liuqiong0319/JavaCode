package day04;

public class CollegeStudent extends Student {
	public void grade(){
		System.out.println("年龄："+age+"大学生都有相应的班级");
	}
	public CollegeStudent(){
		System.out.println("CollegeStudent类执行了");
	}
	
	public void show(){
		System.out.println("使用父类的属性age:"+super.age);
	}
}
