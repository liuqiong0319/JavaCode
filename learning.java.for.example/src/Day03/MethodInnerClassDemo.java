package Day03;
/**
 * @description:局部内部类，是指内部类定义在方法和作用域内
 * @author Administrator
 *
 */
public class MethodInnerClassDemo {
	
	public void show()
	{
		class InnerClass{
				int score=86;
				public int innerShow(){
					System.out.println("this is inner  class method");
					return score+10;			
				}
		}
		InnerClass innerclass=new InnerClass();
		int newscore=innerclass.innerShow();
		System.out.println(newscore);
		System.out.println("this is outer method");
	}
	
	public static void main(String[] args) {
		MethodInnerClassDemo methodInner=new MethodInnerClassDemo();
		methodInner.show();
	}

}
