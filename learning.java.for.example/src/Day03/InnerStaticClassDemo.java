package Day03;
/**
 * @description:嵌套内部类，就是修饰为static的内部类。
 * 声明为static的内部类，不需要内部类对象和外部类对象之间的联系，
 * 就是说我们可以直接引用outer.inner，即不需要创建外部类，也不需要创建内部类。
      嵌套类和普通的内部类还有一个区别：普通内部类不能有static数据和static属性，也不能包含嵌套类，但嵌套类可以。
      而嵌套类不能声明为private，一般声明为public，方便调用。
 * @author Administrator
 *
 */
public class InnerStaticClassDemo {
	private String name = "joan";
	public static int age = 27;
	public static float score = 85.4f;
	public static class Inner{
		private String name = "joan.liu";
		private static int age = 30;
		String province = "上海";
		public void showInner(){
		System.out.println(InnerStaticClassDemo.age);
		//如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员
		InnerStaticClassDemo innerDemo=new InnerStaticClassDemo();
		System.out.println(innerDemo.name);
		//静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 
		System.out.println(score);
		//如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员
		System.out.println(age);
		System.out.println(name);
		
		System.out.println("this is inner class");
		}		
	}
	public void outerShow(){
		System.out.println("this is outer class");
		Inner inner=new Inner();
		inner.showInner();
		System.out.println("外部类的age:"+age);
		System.out.println("内部类的age:"+inner.age);
		System.out.println("内部类的name"+inner.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Inner inner=new Inner();
		//创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();
		inner.showInner();
		
		System.out.println("---------------------");
		InnerStaticClassDemo outerDemo=new InnerStaticClassDemo();
		outerDemo.outerShow();
		
	}

}
