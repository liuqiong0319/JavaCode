package day04;

public final class FinalDemo {//final修饰类，该类不允许被继承
	public final String name;//final修饰属性时，
	//该类的属性不会被隐世的初始化，必须赋值（属性或构造方法中）,只能赋值一次，在其他位置不能修改值

	
	public FinalDemo() {
		name = "joan" ; 
	}
	
	public final void stuInfo(){//final修饰方法时，该方法不能被重写
		final int grade= 16;//常量，不允许被修改。
		System.out.println();
	}
	
	

}
