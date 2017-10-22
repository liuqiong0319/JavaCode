package day05;

public class Circle {
	private double radius;
	private String clour;
	private static double pi = 3.14;

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	public Circle(double radius, String clour) {
		// TODO Auto-generated constructor stub
		this(radius); // 调用一个字符串参数的构造函数。注意：调用其他构造函数的语句，
						// 必须定义在构造函数的第一行。原因：初始化动作要先执行。
		this.clour = clour;
	}

	public double area() {
		return radius * radius * pi;
	}

}
