package day04;

public class Student {

	public String name = "joan";
	public int age;
	
	public void grade(){		
		System.out.println("每个学生都有相应的班级");
	}
	//初始化相当于执行类的构造方法
    // 当创建子类对象时，优先对父类属性初始化，再初始化父类构造方法
	//然后执行子类的属性初始化，再初始化子类的构造方法
	public Student() {
		name = "joan.liu";
		System.out.println("Student类执行了");
	}
	
	//
	
	
}
