package Day03;
/**
 *  @description:
 *  成员内部类，就是作为外部类的成员，可以直接使用外部类的所有成员和方法，即使是private的。
 *  同时外部类要访问内部类的所有成员变量/方法，则需要通过内部类的对象来获取。
 * @author Administrator
 *
 */
public class InnerClassDemo {
	private String name = "joan";
	int score = 69;
	public class Inner{
		String name = "joan.liu";
		public void show(){
			System.out.println("外部类的name:"+InnerClassDemo.this.name);
			// 如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法。
			//如果要访问外部类的成员变量，可以使用 this 关键字
			System.out.println("内部类的name:"+name);			
			System.out.println("此处是内部类的方法");
		}
	}
	
	public void outerShow(){
		InnerClassDemo outer=new InnerClassDemo();
		Inner inner=outer.new Inner();
		//外部类是不能直接使用内部类的成员和方法,
		//可先创建内部类的对象，然后通过内部类的对象来访问其成员变量和方法。
		inner.show();
		System.out.println("这是外部类的方法，并调用内部类的方法");
	}
	
	public static void main(String[] args) {
		InnerClassDemo innerTest=new InnerClassDemo();
		Inner inner=innerTest.new Inner();
		//定义了成员内部类后，必须使用外部类对象来创建内部类对象，
		//而不能直接去 new 一个内部类对象，即：内部类 对象名 = 外部类对象.new 内部类( );
		inner.show();
		innerTest.outerShow();
	}

}
